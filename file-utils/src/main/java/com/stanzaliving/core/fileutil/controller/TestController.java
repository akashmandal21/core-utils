package com.stanzaliving.core.fileutil.controller;

import com.stanzaliving.core.fileutil.service.CSVFileUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class TestController {
    private CSVFileUtilService csvFileUtilService;

    @Autowired
    public TestController(CSVFileUtilService csvFileUtilService) {
        this.csvFileUtilService = csvFileUtilService;
    }

    @ResponseBody
    @GetMapping("/file-upload")
    @ResponseStatus(HttpStatus.OK)
    public String getAllAgreement() {
        return "hi";
    }

}
