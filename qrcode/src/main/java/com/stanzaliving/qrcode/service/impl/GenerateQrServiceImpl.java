package com.stanzaliving.qrcode.service.impl;

import com.amazonaws.services.s3.AmazonS3;
import com.stanza.qr.generator.QRGeneratorUtility;
import com.stanzaliving.core.amazons3.service.S3UploadService;
import com.stanzaliving.core.base.utils.StanzaUtils;
import com.stanzaliving.qrcode.dto.GenerateQrResponseDto;
import com.stanzaliving.qrcode.service.GenerateQrService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 03-Feb-2021
 */

@Log4j2
@Service
public class GenerateQrServiceImpl implements GenerateQrService {

	@Autowired
	private S3UploadService s3UploadService;

	@Override
	public GenerateQrResponseDto generateQrCode(String s3Bucket, String filePath, String fileName, AmazonS3 s3Client) throws IOException {

		String qrContent = String.valueOf(System.nanoTime() + StanzaUtils.getRandomNumberBetweenRange(1000, 10000));

		log.info("Generating qr code with content: {}", qrContent);

		return generateQrCode(s3Bucket, filePath, fileName, s3Client, qrContent);
	}

	@Override
	public GenerateQrResponseDto generateQrCode(String s3Bucket, String filePath, String fileName, AmazonS3 s3Client, String qrContent) throws IOException {
		BufferedImage image = QRGeneratorUtility.generateQRImage(qrContent);

		File outputFile = File.createTempFile("/tmp/" + fileName, ".jpg");

		ImageIO.write(image, "jpg", outputFile);

		String s3RelativeFilePath = s3UploadService.upload(s3Bucket, filePath, outputFile.getName(), outputFile, MediaType.IMAGE_JPEG_VALUE, s3Client, false);

		return GenerateQrResponseDto.builder()
				.qrContent(qrContent)
				.fileName(outputFile.getName())
				.s3RelativeFilePath(s3RelativeFilePath)
				.build();
	}
}
