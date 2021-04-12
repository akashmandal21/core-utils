package com.stanzaliving.core.fileutil.service.impl;

import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.stanzaliving.core.amazons3.util.S3Util;
import com.stanzaliving.core.fileutil.dto.CSVResponse;
import com.stanzaliving.core.fileutil.dto.S3UploadResponse;
import com.stanzaliving.core.fileutil.service.CSVFileUtilService;
import com.stanzaliving.core.fileutil.util.CVSUtil;
import lombok.extern.log4j.Log4j2;
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
@Log4j2
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
        log.info("FILE-UTILS::Reading CSV file from uploaded multipart");
        try {
            return readCSVFile(file.getContentType(), file.getInputStream(), new ArrayList<>());
        } catch (IOException e) {
            throw new StanzaException("FILE-UTILS::Error in reading multipart file");
        }
    }

    @Override
    public CSVResponse readCSVFile(String contentType, InputStream inputStream) {
        log.info("FILE-UTILS::Reading CSV file for input stream");
        return readCSVFile(contentType, inputStream, new ArrayList<>());
    }

    @Override
    public CSVResponse readCSVFile(MultipartFile file, List<String> header) {
        log.info("FILE-UTILS::Reading CSV file with filter header {}", header);
        try {
            return readCSVFile(file.getContentType(), file.getInputStream(), header);
        } catch (IOException e) {
            throw new StanzaException("FILE-UTILS::Error in reading multipart file with filter header {}", (Throwable) header);
        }
    }

    @Override
    public CSVResponse readCSVFile(String contentType, InputStream inputStream, List<String> filterHeader) {
        log.info("FILE-UTILS::Reading CSV file anf filter according to headers {}", filterHeader);
        int totalRecords = 0;
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
                throw new StanzaException("fail to parse CSV file: " + e.getMessage());
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
        log.info("FILE-UTILS::Downloading file from bucket {} , filepath {} to tmp folder", bucket, filePath);
        return s3DownloadService.downloadFile(bucket, filePath, s3Client);
    }

    @Override
    public InputStream retrieveFile(String bucket, String filePath, AmazonS3 s3Client) {
        log.info("FILE-UTILS::Reading file from from path {} and bucket {}", filePath, bucket);
        try {
            GetObjectRequest getObjectRequest = new GetObjectRequest(bucket, filePath);
            S3Object s3Object = S3Util.getAmazonS3Client(s3Client).getObject(getObjectRequest);
            if (s3Object != null) {
                log.info("FILE-UTILS::Converting s3 object to input stream");
                return s3Object.getObjectContent();
            }
        } catch (Exception e) {
            throw new StanzaException("FILE-UTILS::Error in reading multipart file");
        }
        return null;
    }

    @Override
    public CSVResponse readCSVFile(String bucket, String filePath, AmazonS3 s3Client) {
        log.info("FILE-UTILS::Reading file from from path {} and bucket {}", filePath, bucket);
        return readCSVFile(bucket, filePath, s3Client,new ArrayList<>());
    }

    @Override
    public CSVResponse readCSVFile(String bucket, String filePath, AmazonS3 s3Client, List<String> header) {
        log.info("FILE-UTILS::Reading file from from path {} and bucket {} and filtering with header {}", filePath, bucket, header);
        InputStream file= retrieveFile(bucket, filePath, s3Client);
        return file != null ? readCSVFile(CSV_CONTENT_TYPE, file, header) : null;
    }

    @Override
    public S3UploadResponse upload(String bucket, String filePath, String fileName, InputStream inputStream, String contentType, AmazonS3 s3Client, boolean isPublic) {
        log.info("FILE-UTILS::Uploading file {} in filepath {} in bucket {}", fileName, filePath, bucket);
        if(CVSUtil.hasCSVFormat(contentType)){
            return S3UploadResponse.builder()
                    .bucketName(bucket)
                    .filePath(s3UploadService.upload(bucket, filePath, inputStream, contentType, s3Client, isPublic))
                    .build();
        }
        log.error("FILE-UTILS::Error in uploading file {} with filepath {} in bucket {}", fileName, filePath, bucket);
        throw new StanzaException("Failed to store file "+fileName+" due to mismatch in format");
    }

    @Override
    public String getPreSignedURL(String bucket, String filePath, int durationInSeconds, AmazonS3 s3Client) {
        log.info("FILE-UTILS::Getting pre-signed url for filePath {} in bucket {} for duration {}",
                filePath, bucket, durationInSeconds);
        return s3DownloadService.getPreSignedUrl(bucket, filePath, durationInSeconds, s3Client);
    }

}
