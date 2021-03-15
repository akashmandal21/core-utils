package com.stanzaliving.qrcode.service.impl;

import com.amazonaws.services.s3.AmazonS3;
import com.stanzaliving.core.amazons3.service.S3DownloadService;
import com.stanzaliving.qrcode.dto.GenerateQrResponseDto;
import com.stanzaliving.qrcode.entity.QRData;
import com.stanzaliving.qrcode.enums.QRContextType;
import com.stanzaliving.qrcode.repository.QRDataRepository;
import com.stanzaliving.qrcode.service.GenerateQrService;
import com.stanzaliving.qrcode.service.QRGetService;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Log4j2
public class QRGetServiceImpl implements QRGetService {

	@Autowired
	private QRDataRepository qrDataRepository;

	@Autowired
	private GenerateQrService generateQrService;

	@Autowired
	private AmazonS3 s3Client;

	@Value("${aws.s3.bucket}")
	private String s3Bucket;

	@Autowired
	private S3DownloadService s3DownloadService;

	@Override
	public String getQRCode(String contextId, String subContextId, QRContextType qrContextType, String data) {

		if (Objects.isNull(contextId) || Objects.isNull(qrContextType)) {

			log.warn("Either contextId {} or contextType {} is null", contextId, qrContextType);
			return null;
		}

		QRData qrEntity = qrDataRepository.findByContextIdAndSubContextIdAndQrContextType(contextId, subContextId, qrContextType);

		if (qrEntity != null) {

			log.info("QR already exists for contextType: {} with contextId: {} and subcontextId: {}", qrContextType, contextId, subContextId);

			return s3DownloadService.getPreSignedUrl(s3Bucket, qrEntity.getFilePath(), 3600, s3Client);
		}

		try {

			log.info("Generating QR for contextType: {} with contextId: {} and subcontextId: {}", qrContextType, contextId, subContextId);

			String filePath = qrContextType.name();

			String fileName = getFileName(contextId, subContextId, qrContextType);

			GenerateQrResponseDto qrCode = generateQrService.generateQrCode(s3Bucket, filePath, fileName, s3Client);

			if (Objects.nonNull(qrCode) && StringUtils.isNotBlank(qrCode.getS3RelativeFilePath())) {

				log.info("Generated QR on path: {}", qrCode.getS3RelativeFilePath());

				QRData qrData = QRData.builder().contextId(contextId).data(qrCode.getQrContent()).qrContextType(qrContextType)
						.subContextId(subContextId).bucket(s3Bucket).content(data).filePath(qrCode.getS3RelativeFilePath()).fileName(fileName)
						.build();

				qrData = qrDataRepository.save(qrData);

				return s3DownloadService.getPreSignedUrl(s3Bucket, qrCode.getS3RelativeFilePath(), 3600, s3Client);
			}

			log.warn("Failed to upload file: {} on path: {} on s3", fileName, filePath);

		} catch (Exception e) {
			log.error("Got error while generating QR: ", e);
		}

		return null;
	}

	private String getFileName(String contextId, String subContextId, QRContextType qrContextType) {

		StringBuilder filePath = new StringBuilder();

		filePath.append(qrContextType.name());

		if (Objects.nonNull(contextId)) {
			filePath.append("-");
			filePath.append(contextId);
		}
		if (Objects.nonNull(subContextId)) {
			filePath.append("-");
			filePath.append(subContextId);
		}

		return filePath.toString();
	}

}