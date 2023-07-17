package com.stanzaliving.core.fileutil.service.impl;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.stanzaliving.core.amazons3.service.S3DownloadService;
import com.stanzaliving.core.amazons3.service.S3UploadService;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.fileutil.dto.CSVResponse;
import com.stanzaliving.core.fileutil.dto.S3UploadResponse;
import com.stanzaliving.core.fileutil.testdata.GlobalTestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static com.stanzaliving.core.fileutil.testdata.GlobalTestData.getInvalidMultipartFile;
import static com.stanzaliving.core.fileutil.testdata.GlobalTestData.getSampleMultipartFile;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@DisplayName("Testcase for csv file util service")
class CSVFileUtilServiceImplTest {

    @InjectMocks
    CSVFileUtilServiceImpl csvFileUtilService;
    @Mock
    S3DownloadService s3DownloadService;
    @Mock
    S3UploadService s3UploadService;
    @Mock
    AmazonS3 amazonS3;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Unit test case for multipart file reading")
    void readCSVFileMultipartTest() throws Exception {
        MultipartFile file = getSampleMultipartFile();
        CSVResponse expectedResponse = GlobalTestData.getSampleCSVResponse();
        CSVResponse actualResponse = csvFileUtilService.readCSVFile(file);
        assertAll(
                () -> assertEquals(expectedResponse.getHeader(), actualResponse.getHeader()),
                () -> assertEquals(expectedResponse.getData(), actualResponse.getData()),
                () -> assertEquals(expectedResponse.getFilterHeader(), actualResponse.getFilterHeader()),
                () -> assertEquals(expectedResponse.getTotalRecord(), actualResponse.getTotalRecord()),
                () -> assertEquals(expectedResponse.getTotalRecordMatched(), actualResponse.getTotalRecordMatched()));
    }


    @Test
    @DisplayName("Unit test case for content type and inputstream")
    void readCSVFileContentTypeInputStreamTest() throws Exception {
        String contentType = "text/csv";
        InputStream inputStream = getSampleMultipartFile().getInputStream();
        CSVResponse expectedResponse = GlobalTestData.getSampleCSVResponse();
        CSVResponse actualResponse = csvFileUtilService.readCSVFile(contentType, inputStream);
        assertAll(
                () -> assertEquals(expectedResponse.getHeader(), actualResponse.getHeader()),
                () -> assertEquals(expectedResponse.getData(), actualResponse.getData()),
                () -> assertEquals(expectedResponse.getFilterHeader(), actualResponse.getFilterHeader()),
                () -> assertEquals(expectedResponse.getTotalRecord(), actualResponse.getTotalRecord()),
                () -> assertEquals(expectedResponse.getTotalRecordMatched(), actualResponse.getTotalRecordMatched()));
    }

    @Test
    @DisplayName("Unit test case for multipart and header")
    void readCSVFileMultipartHeaderTest() throws Exception {
        MultipartFile file = getSampleMultipartFile();
        List<String> header = new ArrayList<>();
        CSVResponse expectedResponse = GlobalTestData.getSampleCSVResponse();
        CSVResponse actualResponse = csvFileUtilService.readCSVFile(file, header);
        assertAll(
                () -> assertEquals(expectedResponse.getHeader(), actualResponse.getHeader()),
                () -> assertEquals(expectedResponse.getData(), actualResponse.getData()),
                () -> assertEquals(expectedResponse.getFilterHeader(), actualResponse.getFilterHeader()),
                () -> assertEquals(expectedResponse.getTotalRecord(), actualResponse.getTotalRecord()),
                () -> assertEquals(expectedResponse.getTotalRecordMatched(), actualResponse.getTotalRecordMatched()));
    }

    @Test
    @DisplayName("Unit test case for downloading file to local from s3")
    void downloadFileTest(){
        AmazonS3 client = GlobalTestData.getSampleAmazonS3();
        File mockedFile = GlobalTestData.getSampleFile();
        when(s3DownloadService.downloadFile(anyString(), anyString(), any(AmazonS3.class))).thenReturn(mockedFile);
        File output = csvFileUtilService.downloadFile("sample-bucket-name", "sample-path", client);
        Assertions.assertNotNull(output);
    }

    @Test
    @DisplayName("Unit test case for reading input stream from s3 bucket based on bucket, filepath, amazons3")
    void readInputStreamCSVFileTest() throws Exception {
        AmazonS3 client = GlobalTestData.getSampleAmazonS3();
        S3Object s3Object = new S3Object();
        s3Object.setObjectContent(GlobalTestData.getSampleMultipartFile().getInputStream());
        when(amazonS3.getObject(any(GetObjectRequest.class))).thenReturn(s3Object);
        InputStream actual = csvFileUtilService.retrieveFile("stanza-test-bucket", "agreement_2021-04-12T03:35:58Z_sample_2021-02-04 (1).csv", client);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Unit test case for reading csv file from s3 bucket based on bucket, filepath, amazons3")
    void readCSVFileTest() throws Exception {
        AmazonS3 client = GlobalTestData.getSampleAmazonS3();
        S3Object s3Object = new S3Object();
        CSVResponse expectedResponse = GlobalTestData.getSampleCSVResponse();
        s3Object.setObjectContent(GlobalTestData.getSampleMultipartFile().getInputStream());
        when(amazonS3.getObject(any(GetObjectRequest.class))).thenReturn(s3Object);
        CSVResponse actualResponse = csvFileUtilService.readCSVFile("stanza-test-bucket", "agreement_2021-04-12T03:35:58Z_sample_2021-02-04 (1).csv", client);
        assertAll(
                () -> assertEquals(expectedResponse.getHeader(), actualResponse.getHeader()),
                () -> assertEquals(expectedResponse.getData(), actualResponse.getData()),
                () -> assertEquals(expectedResponse.getFilterHeader(), actualResponse.getFilterHeader()),
                () -> assertEquals(expectedResponse.getTotalRecord(), actualResponse.getTotalRecord()),
                () -> assertEquals(expectedResponse.getTotalRecordMatched(), actualResponse.getTotalRecordMatched()));
    }

    @Test
    @DisplayName("Unit test case for getting pre-signed url")
    void getPreSignedURLTest() {
        String url = "sample_url";
        AmazonS3 client = GlobalTestData.getSampleAmazonS3();
        when(s3DownloadService.getPreSignedUrl(anyString(), anyString(), anyInt(), any(AmazonS3.class))).thenReturn(url);
        String actualOutput = csvFileUtilService.getPreSignedURL("stanza-test-bucket","agreement_2021-04-12T03:35:58Z_sample_2021-02-04 (1).csv", 60, client);
       assertEquals(url, actualOutput);
    }

    @Test
    @DisplayName("Unit test case for uploading file to s3 bucket")
    void uploadTest() throws Exception {
        S3UploadResponse expectedResponse = GlobalTestData.getSampleS3UploadResponse();
        MultipartFile file = GlobalTestData.getSampleMultipartFile();
        AmazonS3 client = GlobalTestData.getSampleAmazonS3();
        when(s3UploadService.upload(anyString(),anyString(), any(InputStream.class), anyString(), any(AmazonS3.class), anyBoolean()))
                .thenReturn("agreement_2021-04-12T03:35:58Z_sample_2021-02-04 (1).csv");
        S3UploadResponse actualResponse = csvFileUtilService.upload("stanza-test-bucket", "agreement_2021-04-12T03:35:58Z_sample_2021-02-04 (1).csv",
                "sample_2021-02-04 (1).csv",
                file.getInputStream(), file.getContentType(),client, false);
        assertAll(
                () -> assertEquals(expectedResponse.getFilePath(), actualResponse.getFilePath()),
                () -> assertEquals(expectedResponse.getBucketName(), actualResponse.getBucketName()));
    }

    @Test
    @DisplayName("Unit test case for invalid file type")
    void uploadInvalidCaseTest() throws Exception {
        MultipartFile file = getInvalidMultipartFile();
        AmazonS3 client = GlobalTestData.getSampleAmazonS3();
        assertThatThrownBy(() -> csvFileUtilService.upload("stanza-test-bucket",
                "agreement_2021-04-12T03:35:58Z_sample_2021-02-04 (1).csv",
                "sample_2021-02-04 (1).csv",
                file.getInputStream(), file.getContentType(),client, false))
                .isInstanceOf(StanzaException.class)
                .hasMessage("Failed to store file sample_2021-02-04 (1).csv due to mismatch in format");
    }

}