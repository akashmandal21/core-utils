package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentFileDTO {

    private String bucketName;
    private String fileName;
    private String filePath;
}
