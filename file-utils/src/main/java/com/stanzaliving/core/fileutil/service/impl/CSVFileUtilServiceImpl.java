package com.stanzaliving.core.fileutil.service.impl;

import com.stanzaliving.core.fileutil.dto.CSVResponse;
import com.stanzaliving.core.fileutil.service.CSVFileUtilService;
import com.stanzaliving.core.fileutil.util.CVSUtil;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CSVFileUtilServiceImpl implements CSVFileUtilService {

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

        List<Map<String,String>> csvData = new ArrayList<>();

        if (CVSUtil.hasCSVFormat(contentType)) {
            try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                 CSVParser csvParser = new CSVParser(fileReader,
                         CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
                filterHeader = filterHeader.isEmpty() ? csvParser.getHeaderNames() : filterHeader;
                Iterable<CSVRecord> csvRecords = csvParser.getRecords();
                for (CSVRecord csvRecord : csvRecords) {
                    List<String> finalFilterHeader = filterHeader;
                    Map<String, String> data = csvRecord.toMap().entrySet()
                            .stream().filter(row -> finalFilterHeader.contains(row.getKey()))
                            .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
                    csvData.add(data);
                }

            } catch (IOException e) {
                throw new RuntimeException("fail to parse CSV file: " + e.getMessage()); //todo: throw specific exception
            }
        }
        return CSVResponse.builder().header(filterHeader)
                .totalRecord(csvData.size()).data(csvData).build();
    }
}
