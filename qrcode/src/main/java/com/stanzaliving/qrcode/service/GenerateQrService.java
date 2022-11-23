package com.stanzaliving.qrcode.service;

import com.amazonaws.services.s3.AmazonS3;
import com.stanzaliving.qrcode.dto.GenerateQrResponseDto;

import java.io.IOException;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 03-Feb-2021
 */

public interface GenerateQrService {
	GenerateQrResponseDto generateQrCode(String s3Bucket, String filePath, String fileName, AmazonS3 s3Client) throws IOException;

	GenerateQrResponseDto generateQrCode(String s3Bucket, String filePath, String fileName, AmazonS3 s3Client, String qrContent) throws IOException;
}
