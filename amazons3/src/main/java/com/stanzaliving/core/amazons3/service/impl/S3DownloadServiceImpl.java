/**
 * 
 */
package com.stanzaliving.core.amazons3.service.impl;

import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ListObjectsV2Request;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.stanzaliving.core.amazons3.service.S3DownloadService;
import com.stanzaliving.core.amazons3.util.S3Util;

/**
 * 
 * @author naveen
 *
 * @date 30-Sep-2019
 */
@Service
public class S3DownloadServiceImpl implements S3DownloadService {

	private static final Logger logger = Logger.getLogger(S3DownloadServiceImpl.class);

	@Override
	public String downloadStringContent(String bucket, String filePath, AmazonS3 s3Client) {

		String fileContent = null;

		try {

			logger.debug("Downloading File: " + filePath + " from Bucket: " + bucket);

			GetObjectRequest getObjectRequest = new GetObjectRequest(bucket, filePath);

			S3Object s3Object = S3Util.getAmazonS3Client(s3Client).getObject(getObjectRequest);

			if (s3Object != null) {
				S3ObjectInputStream inputStream = s3Object.getObjectContent();

				fileContent = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
			}

		} catch (Exception e) {
			logger.error("Error while downloading object from S3: ", e);
		}

		return fileContent;
	}

	@Override
	public String downloadStringContent(String bucket, String prefix, String fileName, AmazonS3 s3Client) {

		fileName = S3Util.createFilePathWithPrefix(prefix, fileName);

		return downloadStringContent(bucket, fileName, s3Client);
	}

	@Override
	public File downloadFile(String bucket, String filePath, AmazonS3 s3Client) {

		try {

			logger.debug("Downloading File: " + filePath + " from Bucket: " + bucket);

			GetObjectRequest getObjectRequest = new GetObjectRequest(bucket, filePath);

			S3Object s3Object = S3Util.getAmazonS3Client(s3Client).getObject(getObjectRequest);

			if (s3Object != null) {
				S3ObjectInputStream inputStream = s3Object.getObjectContent();

				File tmp = File.createTempFile(s3Object.getKey(), "");
				Files.copy(inputStream, tmp.toPath(), StandardCopyOption.REPLACE_EXISTING);

				return tmp;
			}

		} catch (Exception e) {
			logger.error("Error while downloading object from S3: ", e);
		}

		return null;
	}

	@Override
	public File downloadFile(String bucket, String prefix, String fileName, AmazonS3 s3Client) {

		fileName = S3Util.createFilePathWithPrefix(prefix, fileName);

		return downloadFile(bucket, fileName, s3Client);
	}

	@Override
	public String getPreSignedUrl(String bucket, String filePath, int durationInSeconds, AmazonS3 s3Client) {

		DateTime expiration = DateTime.now().plusSeconds(durationInSeconds);

		logger.debug("Generating Pre-signed URL for File: " + filePath + " from Bucket: " + bucket + " with Expiration: " + expiration);

		try {
			URL url = S3Util.getAmazonS3Client(s3Client).generatePresignedUrl(bucket, filePath, expiration.toDate());

			if (url != null) {
				return url.toString();
			}
		} catch (Exception e) {
			logger.error("Error while generating Pre-Signed URL for File: " + filePath, e);
		}

		return null;
	}

	@Override
	public String getPreSignedUrl(String bucket, String prefix, String fileName, int durationInSeconds, AmazonS3 s3Client) {

		fileName = S3Util.createFilePathWithPrefix(prefix, fileName);

		return getPreSignedUrl(bucket, fileName, durationInSeconds, s3Client);
	}

	@Override
	public List<S3ObjectSummary> getListOfObjects(String bucket, String prefix, AmazonS3 s3Client) {

		List<S3ObjectSummary> summaryList = new ArrayList<>();

		try {
			logger.info("Listing Objects With Prefix: " + prefix + " from Bucket: " + bucket);

			final ListObjectsV2Request req = new ListObjectsV2Request()
					.withBucketName(bucket)
					.withMaxKeys(200)
					.withPrefix(prefix);

			ListObjectsV2Result result;

			do {
				result = S3Util.getAmazonS3Client(s3Client).listObjectsV2(req);

				summaryList.addAll(result.getObjectSummaries());

				req.setContinuationToken(result.getNextContinuationToken());
			} while (result.isTruncated());

		} catch (AmazonClientException
				| IllegalAccessException e) {
			logger.error("Error while listing objects from s3: ", e);
		}

		return summaryList;
	}

}