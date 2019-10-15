/**
 * 
 */
package com.stanzaliving.core.amazons3.service;

import java.io.File;
import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.S3ObjectSummary;

/**
 * 
 * @author naveen
 *
 * @date 30-Sep-2019
 */
public interface S3DownloadService {

	String downloadStringContent(String bucket, String filePath, AmazonS3 s3Client);

	String downloadStringContent(String bucket, String prefix, String fileName, AmazonS3 s3Client);

	File downloadFile(String bucket, String filePath, AmazonS3 s3Client);

	File downloadFile(String bucket, String prefix, String fileName, AmazonS3 s3Client);

	String getPreSignedUrl(String bucket, String filePath, int durationInSeconds, AmazonS3 s3Client);

	String getPreSignedUrl(String bucket, String prefix, String fileName, int durationInSeconds, AmazonS3 s3Client);

	List<S3ObjectSummary> getListOfObjects(String bucket, String prefix, AmazonS3 s3Client);

}