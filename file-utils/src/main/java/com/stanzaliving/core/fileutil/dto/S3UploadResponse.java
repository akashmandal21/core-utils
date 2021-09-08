package com.stanzaliving.core.fileutil.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class S3UploadResponse {
    private String bucketName;
    private String filePath;
}
