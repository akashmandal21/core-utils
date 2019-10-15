/**
 * 
 */
package com.stanzaliving.core.amazons3.service;

import java.io.File;
import java.io.InputStream;

import com.amazonaws.services.s3.AmazonS3;

/**
 * 
 * @author naveen
 *
 * @date 30-Sep-2019
 */
public interface S3UploadService {

	String upload(String bucket, String filePath, InputStream inputStream, String contentType, AmazonS3 s3Client, boolean isPublic);

	String upload(String bucket, String prefix, String fileName, InputStream inputStream, String contentType, AmazonS3 s3Client, boolean isPublic);

	String upload(String bucket, String filePath, String content, String contentType, AmazonS3 s3Client, boolean isPublic);

	String upload(String bucket, String prefix, String fileName, String content, String contentType, AmazonS3 s3Client, boolean isPublic);

	String upload(String bucket, String filePath, byte[] content, String contentType, AmazonS3 s3Client, boolean isPublic);

	String upload(String bucket, String prefix, String fileName, byte[] content, String contentType, AmazonS3 s3Client, boolean isPublic);

	String upload(String bucket, String filePath, File file, String contentType, AmazonS3 s3Client, boolean isPublic);

	String upload(String bucket, String prefix, String fileName, File file, String contentType, AmazonS3 s3Client, boolean isPublic);

}