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
    private String documentUuid;

    @JsonSetter(value = "user_code")
    private String residentCode;

    @JsonSetter(value = "status")
    private boolean status;

    @JsonSetter(value = "created_at")
    private Date uploadedDate;

    @JsonSetter(value = "created_by")
    private String uploadedBy;

    @JsonSetter(value = "updated_by")
    private String updatedBy;

    @JsonSetter(value = "comment")
    private String rejectionReason;

    @JsonSetter(value = "uuid")
    private String uuid;

    @JsonSetter(value = "mobile")
    private String mobileNumber;
}
