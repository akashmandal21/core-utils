package com.stanzaliving.core.fileutil.service.impl;

import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.stanzaliving.core.amazons3.util.S3Util;
import com.stanzaliving.core.fileutil.dto.CSVResponse;
import com.stanzaliving.core.fileutil.dto.S3UploadResponse;
import com.stanzaliving.core.fileutil.service.CSVFileUtilService;
import com.stanzaliving.core.fileutil.util.CVSUtil;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.amazonaws.services.s3.AmazonS3;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import com.stanzaliving.core.amazons3.service.*;
import com.stanzaliving.core.base.exception.StanzaException;

import static com.stanzaliving.core.fileutil.util.Constants.CSV_CONTENT_TYPE;

@Service
public class CSVFileUtilServiceImpl implements CSVFileUtilService {

    private final S3DownloadService s3DownloadService;
    private final S3UploadService s3UploadService;

    @Autowired
    public CSVFileUtilServiceImpl(S3DownloadService s3DownloadService, S3UploadService s3UploadService) {
        this.s3DownloadService = s3DownloadService;
        this.s3UploadService = s3UploadService;
    }

    @Override
    public CSVResponse readCSVFile(MultipartFile file) {
        try {
            return readCSVFile(file.getContentType(), file.getInputStream(), new ArrayList<>());
        } catch (IOException e) {
            //TODO: Add exception
        }
        return null;
    }

    @Override
    public CSVResponse readCSVFile(String contentType, InputStream inputStream) {
        return readCSVFile(contentType, inputStream, new ArrayList<>());
    }

    @Override
    public CSVResponse readCSVFile(MultipartFile file, List<String> header) {
        try {
            return readCSVFile(file.getContentType(), file.getInputStream(), header);
        } catch (IOException e) {
           //TODO: Add exception
        }
        return null;
    }

    @Override
    public CSVResponse readCSVFile(String contentType, InputStream inputStream, List<String> filterHeader) {
        Integer totalRecords = 0;
        List<String> csvHeader = new ArrayList<>();
        List<Map<String,String>> csvData = new ArrayList<>();
        if (CVSUtil.hasCSVFormat(contentType)) {
            try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                 CSVParser csvParser = new CSVParser(fileReader,
                         CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim())) {
                csvHeader = csvParser.getHeaderNames();
                Iterable<CSVRecord> csvRecords = csvParser.getRecords();
                totalRecords = ((Collection<?>) csvRecords).size();
                for (CSVRecord csvRecord : csvRecords) {
                    List<String> finalFilterHeader = filterHeader.isEmpty() ? csvHeader : filterHeader;
                    Map<String, String> data = csvRecord.toMap().entrySet()
                            .stream().filter(row -> finalFilterHeader.contains(row.getKey()))
                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                    csvData.add(data);
                }

            } catch (IOException e) {
                throw new RuntimeException("fail to parse CSV file: " + e.getMessage()); //todo: throw specific exception
            }
        }
        return CSVResponse.builder()
                .header(csvHeader)
                .filterHeader(filterHeader)
                .totalRecord(totalRecords)
                .totalRecordMatched(csvData.size())
                .data(csvData).build();
    }

    @Override
    public File downloadFile(String bucket, String filePath, AmazonS3 s3Client) {
        return s3DownloadService.downloadFile(bucket, filePath, s3Client);
    }

    @Override
    public InputStream retrieveFile(String bucket, String filePath, AmazonS3 s3Client) {
        try {
            GetObjectRequest getObjectRequest = new GetObjectRequest(bucket, filePath);

            S3Object s3Object = S3Util.getAmazonS3Client(s3Client).getObject(getObjectRequest);

            if (s3Object != null) {
                S3ObjectInputStream inputStream = s3Object.getObjectContent();
                return inputStream;
            }
        } catch (Exception e) {

        }

        return null;
    }

    @Override
    public CSVResponse readCSVFile(String bucket, String filePath, AmazonS3 s3Client) {
        return readCSVFile(bucket, filePath, s3Client,new ArrayList<>());
    }

    @Override
    public CSVResponse readCSVFile(String bucket, String filePath, AmazonS3 s3Client, List<String> header) {
        InputStream file= retrieveFile(bucket, filePath, s3Client);
        return readCSVFile(CSV_CONTENT_TYPE, file, header);
    }

    @Override
    public S3UploadResponse upload(String bucket, String filePath, String fileName, InputStream inputStream, String contentType, AmazonS3 s3Client, boolean isPublic) {
        if(CVSUtil.hasCSVFormat(contentType)){
            return S3UploadResponse.builder()
                    .bucketName(bucket)
                    .filePath(s3UploadService.upload(bucket, filePath, inputStream, contentType, s3Client, isPublic))
                    .build();
        }
        throw new StanzaException(String.format("Failed to store file %f due to mismatch in format", fileName));
    }

    @Override
    public String getPreSignedURL(String bucket, String filePath, int durationInSeconds, AmazonS3 s3Client) {
        return s3DownloadService.getPreSignedUrl(bucket, filePath, durationInSeconds, s3Client);
    }

}
