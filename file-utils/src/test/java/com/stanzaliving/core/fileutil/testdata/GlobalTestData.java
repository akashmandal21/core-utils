package com.stanzaliving.core.fileutil.testdata;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.stanzaliving.core.fileutil.dto.CSVResponse;
import com.stanzaliving.core.fileutil.dto.S3UploadResponse;
import org.mockito.Mockito;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import org.springframework.mock.web.MockMultipartFile;

import java.util.*;

public class GlobalTestData {

    public static CSVResponse getSampleCSVResponse() {
        List<String> headers = new ArrayList<>();
        headers.add("id"); headers.add("user_id"); headers.add("created_at");
        headers.add("updated_at"); headers.add("uuid"); headers.add("created_by"); headers.add("updated_by");
        headers.add("status"); headers.add("received_at"); headers.add("clicked_at");
        List<String> filteredHeaders = new ArrayList<>();
        List<Map<String,String>> hashMapList = new ArrayList<>();
        Map<String, String> row1 = new HashMap<>();
        row1.put("updated_at","NULL");
        row1.put("clicked_at","NULL");
        row1.put("user_id","111");row1.put("received_at","NULL");row1.put("updated_by","NULL");
        row1.put("created_at","2020-12-03 14:16:19");
        row1.put("id","6"); row1.put("created_by","NULL"); row1.put("uuid","6"); row1.put("status","1");
        Map<String, String> row2 = new HashMap<>();
        row2.put("updated_at","NULL");
        row2.put("clicked_at","NULL");
        row2.put("user_id","11");row2.put("received_at","NULL");row2.put("updated_by","NULL");
        row2.put("created_at","2020-12-03 14:16:19");
        row2.put("id","7"); row2.put("created_by","NULL"); row2.put("uuid","7"); row2.put("status","1");
        hashMapList.add(row1);
        hashMapList.add(row2);
       return CSVResponse.builder()
               .header(headers)
               .filterHeader(filteredHeaders)
               .totalRecord(2).totalRecordMatched(2).data(hashMapList).
               build();
    }

    public static MultipartFile getSampleMultipartFile() throws Exception{
        StringBuilder csvBuilder = new StringBuilder();
        csvBuilder.append("id, user_id, created_at, updated_at, uuid, created_by, updated_by, status, received_at, clicked_at\n");
        csvBuilder.append("6, 111, 2020-12-03 14:16:19, NULL, 6, NULL, NULL, 1, NULL, NULL\n");
        csvBuilder.append("7, 11, 2020-12-03 14:16:19, NULL, 7, NULL, NULL, 1, NULL, NULL\n");
        InputStream is = new ByteArrayInputStream(csvBuilder.toString().getBytes());
        MockMultipartFile firstFile = new MockMultipartFile("data", "agreement_2021-04-12T03:35:58Z_sample_2021-02-04 (1).csv", "text/csv", is);
        return firstFile;
    }

    public static MultipartFile getInvalidMultipartFile() throws Exception{
        StringBuilder csvBuilder = new StringBuilder();
        csvBuilder.append("id, user_id, created_at, updated_at, uuid, created_by, updated_by, status, received_at, clicked_at\n");
        csvBuilder.append("6, 111, 2020-12-03 14:16:19, NULL, 6, NULL, NULL, 1, NULL, NULL\n");
        csvBuilder.append("7, 11, 2020-12-03 14:16:19, NULL, 7, NULL, NULL, 1, NULL, NULL\n");
        InputStream is = new ByteArrayInputStream(csvBuilder.toString().getBytes());
        MockMultipartFile firstFile = new MockMultipartFile("data", "agreement_2021-04-12T03:35:58Z_sample_2021-02-04 (1).text", "text", is);
        return firstFile;
    }

    public static S3UploadResponse getSampleS3UploadResponse() throws Exception{
        S3UploadResponse response = new S3UploadResponse();
        response.setBucketName("stanza-test-bucket");
        response.setFilePath("agreement_2021-04-12T03:35:58Z_sample_2021-02-04 (1).csv");
        return response;
    }

    public static AmazonS3 getSampleAmazonS3(){
        String accessKey = "AKIA5DGDZDPSZEFXVQQG";
        String secretKey = "OpT6Q7aRJEM+tCn1w6d06ONXCV2UGllbrtC9Orc8";
        String region = "ap-south-1";
        AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
            return AmazonS3ClientBuilder.standard()
                    .withCredentials(new AWSStaticCredentialsProvider(credentials))
                    .withRegion(region)
                    .build();
    }

    public static File getSampleFile(){
        return Mockito.mock(File.class);
    }
}
