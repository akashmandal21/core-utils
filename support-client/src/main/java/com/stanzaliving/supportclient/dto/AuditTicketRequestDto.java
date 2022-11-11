package com.stanzaliving.supportclient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditTicketRequestDto {

    private String subCategoryUuid;
    private String residenceUuid;
    private String raisedFor;
    private String description;
    private List<String> attachmentUuids;

}