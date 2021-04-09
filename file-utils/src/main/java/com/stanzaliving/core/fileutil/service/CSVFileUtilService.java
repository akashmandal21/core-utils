package com.stanzaliving.core.fileutil.service;

import com.stanzaliving.core.fileutil.dto.CSVResponse;
import org.springframework.core.io.InputStreamSource;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public interface CSVFileUtilService {
    CSVResponse readCSVFile(MultipartFile file);
    CSVResponse readCSVFile(MultipartFile file, List<String> header);
    CSVResponse readCSVFile(String contentType, InputStream inputStream, List<String> filterHeader);
}
