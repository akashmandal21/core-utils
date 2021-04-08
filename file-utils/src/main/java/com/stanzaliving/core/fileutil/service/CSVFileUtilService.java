package com.stanzaliving.core.fileutil.service;

import org.springframework.web.multipart.MultipartFile;

public interface CSVFileUtilService {
    String readCSVFile(MultipartFile file);
}
