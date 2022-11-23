package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidentDocumentMigrationDTO {
    @JsonSetter(value = "uuid")
    private String uuid;

    @JsonSetter(value = "document_upload_type")
    private String documentType;

    @JsonSetter(value = "created_by")
    private String uploadedBy;

    @JsonSetter(value = "created_at")
    private Date uploadedDate;

    @JsonSetter(value = "updated_by")
    private String updatedBy;

    @JsonSetter(value = "updated_at")
    private Date updatedDate;

    @JsonSetter(value = "user_id")
    private String residentUuid;

    @JsonSetter(value = "is_verified")
    private boolean isVerified;

    @JsonSetter(value = "file_metadata")
    private String metadata;

    @JsonSetter(value = "resident_document_context")
    private String residentDocumentContext;

    @JsonSetter(value = "document_side_type")
    private String documentSide;

    @JsonSetter(value = "file_path")
    private String filePath;

    @JsonSetter(value = "file_name")
    private String fileName;

    @JsonSetter(value = "bucket_name")
    private String bucketName;

    @JsonSetter(value = "status")
    private boolean status;
}
