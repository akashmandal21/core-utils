package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentDetailMigrationDTO {

    @JsonSetter(value = "file_path")
    private String filePath;

    @JsonSetter(value = "file_name")
    private String fileName;

    @JsonSetter(value = "file_bucket")
    private String bucketName;

    @JsonSetter(value = "uuid")
    private String documentUuid;

    @JsonSetter(value = "status")
    private boolean status;

    @JsonSetter(value = "created_at")
    private Date createdAt;

    @JsonSetter(value = "updated_at")
    private Date updatedAt;
}
