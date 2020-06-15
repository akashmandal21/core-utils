package com.stanzaliving.qrcode.service.impl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3;
import com.stanza.qr.generator.QRGeneratorUtility;
import com.stanzaliving.core.amazons3.service.S3DownloadService;
import com.stanzaliving.core.amazons3.service.S3UploadService;
import com.stanzaliving.qrcode.entity.QRData;
import com.stanzaliving.qrcode.enums.QRContextType;
import com.stanzaliving.qrcode.repository.QRDataRepository;
import com.stanzaliving.qrcode.service.QRGetService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class QRGetServiceImpl implements QRGetService {

	@Autowired
	private QRDataRepository qrDataRepository;
	
	@Autowired
	private S3UploadService s3UploadService;

	@Autowired
	private AmazonS3 s3Client;
	
	@Value("${aws.s3.bucket}")
	private String s3Bucket;

	@Autowired
	private S3DownloadService s3DownloadService;

	@Override
	public String getQRCode(String contextId, String subContextId, QRContextType qrContextType,String data) {
		
		if(Objects.isNull(contextId) || Objects.isNull(qrContextType)) {
			
			log.info("Either contextId {} or contextType {} is null",contextId,qrContextType);
			
			return null;
		}
		
		QRData qrEntity = qrDataRepository.findByContextIdAndSubContextIdAndQrContextType
														(contextId, subContextId, qrContextType);
		
		if(qrEntity != null) {
			return s3DownloadService.getPreSignedUrl(s3Bucket, qrEntity.getFilePath(), 3600, s3Client);
		}
		
		String qrContent = ((Long)System.nanoTime()).toString();
		
		BufferedImage image = null;
		
		try {
			image = QRGeneratorUtility.generateQRImageUsingLong(qrContent);
		
			String filePath = getFilePath(contextId, subContextId, qrContextType);
			
			File outputfile = new File("/tmp/"+filePath+".jpg");

			ImageIO.write(image, "jpg", outputfile);
			
			String outputFile = s3UploadService.upload(s3Bucket, filePath, outputfile, "jpeg", s3Client, false);
			
			if(Objects.nonNull(outputFile)) {
				
				QRData qrData = QRData.builder().contextId(contextId).data(qrContent).qrContextType(qrContextType)
						.subContextId(subContextId).bucket(s3Bucket).content(data).filePath(outputFile).fileName(filePath)
						.build();
				
				qrData = qrDataRepository.save(qrData);
				
				return s3DownloadService.getPreSignedUrl(s3Bucket, outputFile, 3600, s3Client);
			}
			
			return null;
			
		} catch (IOException e) {
			log.error("Got error while generating image ",e);
			return null;
		}
		
	}
	
	String getFilePath(String contextId, String subContextId, QRContextType qrContextType) {
		
		
		StringBuilder filePath = new StringBuilder();
		
		filePath.append(qrContextType.name());
		
		if(Objects.nonNull(contextId)) {
			filePath.append("-");
			filePath.append(contextId);
		}
		if(Objects.nonNull(subContextId)) {
			filePath.append("-");
			filePath.append(subContextId);
		}
		
		return filePath.toString();
	}

}
