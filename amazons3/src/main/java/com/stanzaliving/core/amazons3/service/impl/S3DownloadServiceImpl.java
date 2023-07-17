/**
 * 
 */
package com.stanzaliving.core.amazons3.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.IOUtils;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.stanzaliving.core.amazons3.service.S3DownloadService;
import com.stanzaliving.core.amazons3.util.S3Util;

import lombok.extern.log4j.Log4j2;

/**
 * 
 * @author naveen
 *
 * @date 30-Sep-2019
 */
@Log4j2
@Service
public class S3DownloadServiceImpl implements S3DownloadService {

	@Override
	public String downloadStringContent(String bucket, String filePath, AmazonS3 s3Client) {

		String fileContent = null;
		S3Object s3Object = null;
		try {

			log.debug("Downloading File: " + filePath + " from Bucket: " + bucket);

			GetObjectRequest getObjectRequest = new GetObjectRequest(bucket, filePath);

			s3Object = S3Util.getAmazonS3Client(s3Client).getObject(getObjectRequest);

			if (s3Object != null) {
				S3ObjectInputStream inputStream = s3Object.getObjectContent();


				fileContent = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
			}

		} catch (Exception e) {
			log.error("Error while downloading object from S3: ", e);
		} finally {
			if (s3Object != null) {
				try {
					s3Object.close();
				} catch (IOException e) {
					log.error("IOException while closing s3Object: ", e);
				}
			}
		}

		return fileContent;
	}

	@Override
	public String downloadStringContentInBase64(String bucket, String filePath, AmazonS3 s3Client) {

		String fileContent = null;
		S3Object s3Object = null;
		try {

			log.debug("Downloading File: " + filePath + " from Bucket: " + bucket);

			GetObjectRequest getObjectRequest = new GetObjectRequest(bucket, filePath);

			s3Object = S3Util.getAmazonS3Client(s3Client).getObject(getObjectRequest);

			if (s3Object != null) {
				S3ObjectInputStream inputStream = s3Object.getObjectContent();
				byte[] bytes = IOUtils.toByteArray(inputStream);
				fileContent = Base64.getEncoder().encodeToString(bytes);
			}

		} catch (Exception e) {
			log.error("Error while downloading object from S3: ", e);
		} finally {
			if (s3Object != null) {
				try {
					s3Object.close();
				} catch (IOException e) {
					log.error("IOException while closing s3Object: ", e);
				}
			}
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
		S3Object s3Object = null;
		File tmp = null;
		try {

			log.debug("Downloading File: " + filePath + " from Bucket: " + bucket);

			GetObjectRequest getObjectRequest = new GetObjectRequest(bucket, filePath);

			s3Object = S3Util.getAmazonS3Client(s3Client).getObject(getObjectRequest);

			if (s3Object != null) {
				S3ObjectInputStream inputStream = s3Object.getObjectContent();

				tmp = File.createTempFile(s3Object.getKey(), "");
				Files.copy(inputStream, tmp.toPath(), StandardCopyOption.REPLACE_EXISTING);

				return tmp;
			}

		} catch (Exception e) {
			log.error("Error while downloading object from S3: ", e);
		} finally {
			if (s3Object != null) {
				try {
					s3Object.close();
					//Dont call this
//					tmp.delete();
				} catch (IOException e) {
					log.error("IOException while closing s3Object: ", e);
				}
			}
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

		log.debug("Generating Pre-signed URL for File: " + filePath + " from Bucket: " + bucket + " with Expiration: " + expiration);

		try {
			URL url = S3Util.getAmazonS3Client(s3Client).generatePresignedUrl(bucket, filePath, expiration.toDate());

			if (url != null) {
				return url.toString();
			}
		} catch (Exception e) {
			log.error("Error while generating Pre-Signed URL for File: " + filePath, e);
		}

		return null;
	}

	@Override
	public String getPreSignedUrlWithContentSpec(AmazonS3 s3Client, GeneratePresignedUrlRequest presignedUrlRequest) {
		try {
			URL url = S3Util.getAmazonS3Client(s3Client).generatePresignedUrl(presignedUrlRequest);

			if (url != null) {
				return url.toString();
			}
		} catch (Exception e) {
			log.error("Error while generating Pre-Signed URL for File: " + presignedUrlRequest.getKey(), e);
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
			log.info("Listing Objects With Prefix: " + prefix + " from Bucket: " + bucket);

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
			log.error("Error while listing objects from s3: ", e);
		}

		return summaryList;
	}

}