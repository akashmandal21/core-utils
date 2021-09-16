package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintAttachmentMigrationDto {

    @JsonSetter(value="complaint_uuid")
    private String complaintUuid;

    @JsonSetter(value="attachment_type")
    private String attachmentType;

    @JsonSetter(value="attachment_path")
    private String attachmentPath;
}
