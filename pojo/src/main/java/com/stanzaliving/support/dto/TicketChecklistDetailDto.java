package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketChecklistDetailDto {
    private String ticketUuid;
    private String checklist;
    private String checklistUuid;
    private Boolean isMarkedNa;
    private Boolean isClosed;
}