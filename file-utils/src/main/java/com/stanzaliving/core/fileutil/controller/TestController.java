package com.stanzaliving.core.fileutil.controller;

import com.stanzaliving.core.fileutil.dto.CSVResponse;
import com.stanzaliving.core.fileutil.service.CSVFileUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class TestController {
    private CSVFileUtilService csvFileUtilService;

    @Autowired
    public TestController(CSVFileUtilService csvFileUtilService) {
        this.csvFileUtilService = csvFileUtilService;
    }

    @ResponseBody
    @PostMapping(value = "/file-upload", consumes = {"multipart/form-data"})
    @ResponseStatus(HttpStatus.OK)
    public CSVResponse getAllAgreement(@RequestParam("File") MultipartFile file) {
        return csvFileUtilService.readCSVFile(file);
    }
}
