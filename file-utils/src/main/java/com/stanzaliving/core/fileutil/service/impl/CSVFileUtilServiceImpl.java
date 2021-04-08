package com.stanzaliving.core.fileutil.service.impl;

import com.stanzaliving.core.fileutil.service.CSVFileUtilService;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CSVFileUtilServiceImpl implements CSVFileUtilService {

    @Override
    public String readCSVFile(MultipartFile file) {
        String message = "";

        if (file.getContentType().equals("text/csv")) {
            try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(file.getInputStream(), "UTF-8"));
                 CSVParser csvParser = new CSVParser(fileReader,
                         CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
                System.out.println(csvParser.getHeaderNames());
                List<String> filterHeader = new ArrayList<>();
//                filterHeader.add("status");
//                filterHeader.add("created_at");
                //particular headers
                //filter
                Iterable<CSVRecord> csvRecords = csvParser.getRecords();
                for (CSVRecord csvRecord : csvRecords) {
                    System.out.println(csvRecord.toMap().entrySet()
                            .stream().filter(row -> !filterHeader.isEmpty() ? filterHeader.contains(row.getKey()) : true)
                            .collect(Collectors.toMap(map ->map.getKey(), map -> map.getValue())));
                }

            } catch (IOException e) {
                throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
            }
        }
        return message;
    }
}
