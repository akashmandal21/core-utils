package com.stanzaliving.core.fileutil.service;

import com.amazonaws.services.s3.AmazonS3;
import com.stanzaliving.core.fileutil.dto.CSVResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;
import java.util.List;

public interface CSVFileUtilService {
    CSVResponse readCSVFile(MultipartFile file);
    CSVResponse readCSVFile(String contentType, InputStream inputStream);
    CSVResponse readCSVFile(MultipartFile file, List<String> header);
    CSVResponse readCSVFile(String contentType, InputStream inputStream, List<String> filterHeader);
    File downloadFile(String bucket, String filePath, AmazonS3 s3Client);
    CSVResponse readCSVFile(String bucket, String filePath, AmazonS3 s3Client,List<String> header);

}
