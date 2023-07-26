package com.stanzaliving.core.fileutil.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.stanzaliving.core.fileutil.dto.CSVResponse;
import com.stanzaliving.core.fileutil.dto.S3UploadResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface CSVFileUtilService {

    CSVResponse readCSVFile(MultipartFile file);

    CSVResponse readCSVFile(String contentType, InputStream inputStream);

    CSVResponse readCSVFile(MultipartFile file, List<String> header);

    CSVResponse readCSVFile(String contentType, InputStream inputStream, List<String> filterHeader) throws IOException;

    CSVResponse readCSVFile(String bucket, String filePath, AmazonS3 s3Client);

    CSVResponse readCSVFile(String bucket, String filePath, AmazonS3 s3Client, List<String> header);

    File downloadFile(String bucket, String filePath, AmazonS3 s3Client);

    InputStream retrieveFile(String bucket, String filePath, AmazonS3 s3Client);

    S3UploadResponse upload(String bucket, String filePath, String fileName, InputStream inputStream, String contentType, AmazonS3 s3Client, boolean isPublic);

    String getPreSignedURL(String bucket, String filePath, int durationInSeconds, AmazonS3 s3Client);

    S3ObjectInputStream downloadFileFromS3(String bucket, String filePath, AmazonS3 s3Client);

    CSVResponse readCSVFile(String contentType, InputStream inputStream, List<String> filterHeader, String... header);

    CSVResponse readCSVFile(MultipartFile file, String... header);

    CSVResponse readCSVFile(String contentType, InputStream inputStream, String... header);

}