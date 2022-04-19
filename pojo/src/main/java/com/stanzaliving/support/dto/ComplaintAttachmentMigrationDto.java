package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintAttachmentMigrationDto {

    @JsonSetter(value="id")
    private Long id;

    @JsonSetter(value="uuid")
    private String uuid;

    @JsonSetter(value="complaint_uuid")
    private String complaintUuid;

    @JsonSetter(value="attachment_name")
    private String attachmentName;

    @JsonSetter(value="attachment_type")
    private String attachmentType;

    @JsonSetter(value="attachment_bucket")
    private String attachmentBucket;

    @JsonSetter(value="attachment_path")
    private String attachmentPath;

    @JsonSetter(value="created_at")
    private Date createdAt;

    @JsonSetter(value="created_by")
    private String createdBy;

    @JsonSetter(value="status")
    private boolean status;

    @JsonSetter(value="updated_at")
    private Date updatedAt;

    @JsonSetter(value="updated_by")
    private String updatedBy;


}
