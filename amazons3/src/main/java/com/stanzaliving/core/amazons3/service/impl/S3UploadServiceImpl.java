/**
 * 
 */
package com.stanzaliving.core.amazons3.service.impl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.stanzaliving.core.amazons3.service.S3UploadService;
import com.stanzaliving.core.amazons3.util.S3Util;

/**
 * 
 * @author naveen
 *
 * @date 30-Sep-2019
 */
@Service
public class S3UploadServiceImpl implements S3UploadService {

	private static final Logger logger = Logger.getLogger(S3UploadServiceImpl.class);

	@Override
	public String upload(String bucket, String filePath, InputStream inputStream, String contentType, AmazonS3 s3Client, boolean isPublic) {

		if (inputStream != null) {

			try {
				logger.debug("Uploading " + filePath + " in Bucket: " + bucket);

				ObjectMetadata meta = new ObjectMetadata();
				meta.setContentLength(inputStream.available());
				meta.setContentType(contentType);

				PutObjectRequest putObjectRequest = new PutObjectRequest(bucket, filePath, inputStream, meta);

				if (isPublic) {
					logger.debug("Uploading " + filePath + " in Bucket: " + bucket + " as Public Readable");
					putObjectRequest = putObjectRequest.withCannedAcl(CannedAccessControlList.PublicRead);
				}

				PutObjectResult result = S3Util.getAmazonS3Client(s3Client).putObject(putObjectRequest);

				if (result != null) {

					logger.debug(filePath + " Uploaded Successfully in Bucket: " + bucket);

					return filePath;
				}

			} catch (Exception e) {
				logger.error("Error uploading file on S3: ", e);
			}
		} else {
			logger.warn("Content InputStream is null. Not Uploading on S3");
		}

		return null;
	}

	@Override
	public String upload(String bucket, String prefix, String fileName, InputStream inputStream, String contentType, AmazonS3 s3Client, boolean isPublic) {

		fileName = S3Util.createFilePathWithPrefix(prefix, fileName);

		return upload(bucket, fileName, inputStream, contentType, s3Client, isPublic);
	}

	@Override
	public String upload(String bucket, String filePath, String content, String contentType, AmazonS3 s3Client, boolean isPublic) {

		if (StringUtils.isNotBlank(content)) {

			logger.debug("Uploading " + filePath + " in Bucket: " + bucket);

			InputStream inputstream = new ByteArrayInputStream(content.getBytes());

			return upload(bucket, filePath, inputstream, contentType, s3Client, isPublic);

		} else {
			logger.warn("File Content is Empty. Not Uploading on S3");
		}

		return null;
	}

	@Override
	public String upload(String bucket, String prefix, String fileName, String content, String contentType, AmazonS3 s3Client, boolean isPublic) {

		fileName = S3Util.createFilePathWithPrefix(prefix, fileName);

		return upload(bucket, fileName, content, contentType, s3Client, isPublic);
	}

	@Override
	public String upload(String bucket, String filePath, byte[] content, String contentType, AmazonS3 s3Client, boolean isPublic) {

		if (content != null && content.length > 0) {

			logger.debug("Uploading " + filePath + " in Bucket: " + bucket);

			InputStream inputstream = new ByteArrayInputStream(content);

			return upload(bucket, filePath, inputstream, contentType, s3Client, isPublic);

		} else {
			logger.warn("File Byte Content is Empty. Not Uploading on S3");
		}

		return null;
	}

	@Override
	public String upload(String bucket, String prefix, String fileName, byte[] content, String contentType, AmazonS3 s3Client, boolean isPublic) {

		fileName = S3Util.createFilePathWithPrefix(prefix, fileName);

		return upload(bucket, fileName, content, contentType, s3Client, isPublic);
	}

	@Override
	public String upload(String bucket, String filePath, File file, String contentType, AmazonS3 s3Client, boolean isPublic) {

		if (file != null && file.exists()) {

			logger.debug("Uploading " + filePath + " in Bucket: " + bucket);

			try {
				InputStream inputstream = new FileInputStream(file);

				return upload(bucket, filePath, inputstream, contentType, s3Client, isPublic);

			} catch (FileNotFoundException e) {
				logger.error("File Not Found to Upload to S3: ", e);
			}

		} else {
			logger.warn("File Content is Empty. Not Uploading on S3");
		}

		return null;
	}

	@Override
	public String upload(String bucket, String prefix, String fileName, File file, String contentType, AmazonS3 s3Client, boolean isPublic) {

		fileName = S3Util.createFilePathWithPrefix(prefix, fileName);

		return upload(bucket, fileName, file, contentType, s3Client, isPublic);
	}

}