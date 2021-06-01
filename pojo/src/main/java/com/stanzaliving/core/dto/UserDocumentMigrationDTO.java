package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDocumentMigrationDTO {

    @JsonSetter(value = "document_type")
    private String documentType;

    @JsonSetter(value = "document_status")
    private String approvalStatus;

    @JsonSetter(value = "approved_at")
    private Date approvalDate;

    @JsonSetter(value = "rejected_at")
    private Date rejectionDate;

    @JsonSetter(value = "document_id")
    private String documentId;
}
