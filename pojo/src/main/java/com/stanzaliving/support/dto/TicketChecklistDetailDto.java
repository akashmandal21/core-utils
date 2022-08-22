package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;

@Data
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TicketChecklistDetailDto {
    private String ticketUuid;
    private String checklist;
    private String checklistUuid;
    private Boolean isMarkedNa;
    private Boolean isClosed;
    private Boolean isMandatory;
    private Integer position;
//    private String attachmentLocation;
//    private String attachmentType;
//    private long fileSize;
}