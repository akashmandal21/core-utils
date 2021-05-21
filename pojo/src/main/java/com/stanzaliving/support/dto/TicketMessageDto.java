package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketMessageDto {
    private Long id;
    private String uuid;
    private String ticketUuid;
    private String message;
    private List<String> attachmentIds;
    private String messagedBy;
    private boolean isPrivate;
}
