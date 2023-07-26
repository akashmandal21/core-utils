package com.stanzaliving.core.fileutil.service.impl;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.stanzaliving.core.amazons3.service.S3DownloadService;
import com.stanzaliving.core.amazons3.service.S3UploadService;
import com.stanzaliving.core.amazons3.util.S3Util;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.fileutil.dto.CSVResponse;
import com.stanzaliving.core.fileutil.dto.S3UploadResponse;
import com.stanzaliving.core.fileutil.service.CSVFileUtilService;
import com.stanzaliving.core.fileutil.util.CVSUtil;
import com.stanzaliving.core.fileutil.util.ExcelUtil;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

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

    /**
     * Read CSV multipart file
     *
     * @param file
     * @return return the content and meta data of CSV in CSVResponse dto
     */
    @Override
    public CSVResponse readCSVFile(MultipartFile file) {
        log.info("FILE-UTILS::Reading CSV file from uploaded multipart");
        try {
            return readCSVFile(file.getContentType(), file.getInputStream(), new ArrayList<>());
        } catch (IOException e) {
            throw new StanzaException("FILE-UTILS::Error in reading multipart file");
        }
    }

    /**
     * Read CSV file based on content type and input stream
     *
     * @param contentType content type of the file
     * @param inputStream content of the file in input stream
     * @return return the content and meta data of CSV in CSVResponse dto
     */
    @Override
    public CSVResponse readCSVFile(String contentType, InputStream inputStream) {
        log.info("FILE-UTILS::Reading CSV file for input stream");
        return readCSVFile(contentType, inputStream, new ArrayList<>());
    }

    /**
     * Read CSV file based on multipart file and filter the details of list of header
     * If the filter list is empty then the response contents all content
     *
     * @param file
     * @param header
     * @return return the content and meta data of CSV in CSVResponse dto
     */
    @Override
    public CSVResponse readCSVFile(MultipartFile file, List<String> header) {
        log.info("FILE-UTILS::Reading CSV file with filter header {}", header);
        try {
            return readCSVFile(file.getContentType(), file.getInputStream(), header);
        } catch (IOException e) {
            throw new StanzaException("FILE-UTILS::Error in reading multipart file with filter header {}", (Throwable) header);
        }
    }

    /**
     * Read CSV file based on content type, input stream and filter the details of list of header
     *
     * @param contentType
     * @param inputStream
     * @param filterHeader
     * @return return the content and meta data of CSV in CSVResponse dto
     */
    @Override
    public CSVResponse readCSVFile(String contentType, InputStream inputStream, List<String> filterHeader) {
        log.info("FILE-UTILS::Reading CSV file anf filter according to headers {}", filterHeader);
        int totalRecords = 0;
        List<String> csvHeader = new ArrayList<>();
        List<Map<String, String>> csvData = new ArrayList<>();
        if (CVSUtil.hasCSVFormat(contentType) || ExcelUtil.hasExcelFormat(contentType)) {
            try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)); CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim())) {

                csvHeader = csvParser.getHeaderNames();
                Iterable<CSVRecord> csvRecords = csvParser.getRecords();
                totalRecords = ((Collection<?>) csvRecords).size();
                for (CSVRecord csvRecord : csvRecords) {
                    List<String> finalFilterHeader = filterHeader.isEmpty() ? csvHeader : filterHeader;
                    Map<String, String> data = csvRecord.toMap().entrySet().stream().filter(row -> finalFilterHeader.contains(row.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                    csvData.add(data);
                }

            } catch (IOException e) {
                throw new StanzaException("fail to parse CSV file: " + e.getMessage());
            } finally {
                try {
                    if (Objects.nonNull(inputStream)) {
                        inputStream.close();
                    }
                }catch (IOException e) {
                   log.error("fail to close input stream : " + e.getMessage());
                }
            }
        }
        return CSVResponse.builder().header(csvHeader).filterHeader(filterHeader).totalRecord(totalRecords).totalRecordMatched(csvData.size()).data(csvData).build();
    }

    /**
     * Download a file from S3 based on bucket name, file path, Amazons3 client details
     *
     * @param bucket   s3 bucket name
     * @param filePath of the file
     * @param s3Client AmazonS3 client configuration
     * @return download the file inside tmp folder
     */
    @Override
    public File downloadFile(String bucket, String filePath, AmazonS3 s3Client) {
        log.info("FILE-UTILS::Downloading file from bucket {} , filepath {} to tmp folder", bucket, filePath);
        return s3DownloadService.downloadFile(bucket, filePath, s3Client);
    }

    /**
     * Get the stream data of the file from S3 storage
     *
     * @param bucket   s3 bucket name
     * @param filePath of the file
     * @param s3Client AmazonS3 client configuration
     * @return Stream data of the file
     */
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

    /**
     * Read the CSV file from S3 bucket
     *
     * @param bucket   s3 bucket name
     * @param filePath of the file
     * @param s3Client AmazonS3 client configuration
     * @return return the content and meta data of CSV in CSVResponse dto
     */
    @Override
    public CSVResponse readCSVFile(String bucket, String filePath, AmazonS3 s3Client) {
        log.info("FILE-UTILS::Reading file from from path {} and bucket {}", filePath, bucket);
        return readCSVFile(bucket, filePath, s3Client, new ArrayList<>());
    }

    /**
     * Read the CSV file from S3 bucket for specific headers
     *
     * @param bucket   s3 bucket name
     * @param filePath of the file
     * @param s3Client AmazonS3 client configuration
     * @param header   filter headers
     * @return return the content and meta data of CSV in CSVResponse dto
     */
    @Override
    public CSVResponse readCSVFile(String bucket, String filePath, AmazonS3 s3Client, List<String> header) {
        log.info("FILE-UTILS::Reading file from from path {} and bucket {} and filtering with header {}", filePath, bucket, header);
        InputStream file = retrieveFile(bucket, filePath, s3Client);
        return file != null ? readCSVFile(CSV_CONTENT_TYPE, file, header) : null;
    }

    /**
     * Upload CSV file to S3 bucket
     *
     * @param bucket      s3 bucket name
     * @param filePath    file path in bucket
     * @param fileName    file name
     * @param inputStream file content in stream
     * @param contentType content type of the file
     * @param s3Client    AmazonS3 configuration details
     * @param isPublic    boolean to set the visibility of the file
     * @return details of bucket and file path after saving
     */
    @Override
    public S3UploadResponse upload(String bucket, String filePath, String fileName, InputStream inputStream, String contentType, AmazonS3 s3Client, boolean isPublic) {
        log.info("FILE-UTILS::Uploading file {} in filepath {} in bucket {}", fileName, filePath, bucket);
        if (CVSUtil.hasCSVFormat(contentType) || ExcelUtil.hasExcelFormat(contentType)) {
            return S3UploadResponse.builder().bucketName(bucket).filePath(s3UploadService.upload(bucket, filePath, inputStream, contentType, s3Client, isPublic)).build();
        }
        log.error("FILE-UTILS::Error in uploading file {} with filepath {} in bucket {}", fileName, filePath, bucket);
        throw new StanzaException("Failed to store file " + fileName + " due to mismatch in format");
    }

    /**
     * Create pre-signed url for a file
     *
     * @param bucket            s3 bucket name
     * @param filePath          file path in bucket
     * @param durationInSeconds validity time for link in seconds
     * @param s3Client          Amazons3 configuration details
     * @return the created pre-signed url for the file
     */
    @Override
    public String getPreSignedURL(String bucket, String filePath, int durationInSeconds, AmazonS3 s3Client) {
        log.info("FILE-UTILS::Getting pre-signed url for filePath {} in bucket {} for duration {}", filePath, bucket, durationInSeconds);
        return s3DownloadService.getPreSignedUrl(bucket, filePath, durationInSeconds, s3Client);
    }

    /**
     * Download file from s3 bucket
     *
     * @param bucket   bucket name
     * @param filePath file path
     * @param s3Client s3 client configuration
     * @return
     */
    @Override
    public S3ObjectInputStream downloadFileFromS3(String bucket, String filePath, AmazonS3 s3Client) {
        log.info("FILE-UTILS::Download file in filepath {} in bucket {}", filePath, bucket);
        S3ObjectInputStream stream = (S3ObjectInputStream) retrieveFile(bucket, filePath, s3Client);
        return stream;
    }

    @Override
    public CSVResponse readCSVFile(String contentType, InputStream inputStream, List<String> filterHeader, String... header) {
        log.info("FILE-UTILS::Reading CSV file and filter according to headers {}", filterHeader);

        int totalRecords = 0;
        int count = 1;
        List<String> csvHeader = new ArrayList<>();
        List<Map<String, String>> csvData = new ArrayList<>();

        if (CVSUtil.hasCSVFormat(contentType) || ExcelUtil.hasExcelFormat(contentType)) {
            try {
                String line;
                List<String> realHeaders = new ArrayList<>();
                List<String> headers = Arrays.stream(header).collect(Collectors.toList());
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                while ((line = fileReader.readLine()) != null) {
                    realHeaders = Arrays.stream(line.trim().split(",")).map(String::trim).collect(Collectors.toList());
                    if (!Collections.disjoint(headers, realHeaders)) break;
                    log.info("Skipping line number {}", count);
                    count++;
                }
                if (realHeaders.isEmpty()) throw new StanzaException("fail to parse CSV file");
                String[] finalHeaders = new String[realHeaders.size()];
                CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withHeader(realHeaders.toArray(finalHeaders)).withIgnoreHeaderCase().withTrim());

                csvHeader = csvParser.getHeaderNames();
                Iterable<CSVRecord> csvRecords = csvParser.getRecords();

                totalRecords = ((Collection<?>) csvRecords).size();
                List<String> finalFilterHeader = filterHeader.isEmpty() ? csvHeader : filterHeader;
                for (CSVRecord csvRecord : csvRecords) {
                    Map<String, String> data = csvRecord.toMap().entrySet().stream().filter(row -> finalFilterHeader.contains(row.getKey().trim())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                    csvData.add(data);
                }

            } catch (IOException e) {
                throw new StanzaException("fail to parse CSV file: " + e);
            }
        }
        return CSVResponse.builder().header(csvHeader).filterHeader(filterHeader).totalRecord(totalRecords).totalRecordMatched(csvData.size()).data(csvData).build();
    }

    @Override
    public CSVResponse readCSVFile(MultipartFile file, String... header) {
        log.info("FILE-UTILS::Reading CSV file from uploaded multipart");
        try {
            return readCSVFile(file.getContentType(), file.getInputStream(), new ArrayList<>(), header);
        } catch (IOException e) {
            throw new StanzaException("FILE-UTILS::Error in reading multipart file");
        }
    }

    @Override
    public CSVResponse readCSVFile(String contentType, InputStream inputStream, String... header) {
        log.info("FILE-UTILS::Reading CSV file for input stream");
        return readCSVFile(contentType, inputStream, new ArrayList<>(), header);
    }
}
