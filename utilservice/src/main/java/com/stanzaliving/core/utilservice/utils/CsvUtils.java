package com.stanzaliving.core.utilservice.utils;

import com.opencsv.CSVReader;
import lombok.experimental.UtilityClass;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@UtilityClass
public class CsvUtils {

    public List<List<String>> getCsvFileRecords(MultipartFile csvFile) throws IOException {

        File file = convertMultiPartToFile(csvFile);
        List<List<String>> records = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(file));) {

            String[] values = null;

            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }

        }

        return records;
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }
}
