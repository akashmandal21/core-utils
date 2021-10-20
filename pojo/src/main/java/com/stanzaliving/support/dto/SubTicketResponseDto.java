package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubTicketResponseDto {
    private String ticketId;
    private String taskTypeUuid;
    private String subTicketUuid;
    private String subTicketId;
    private String team;
    private String teamUuid;
    private String assignedTo;
    private String assignedToUuid;
    private Date slaTime;
    private String description;
    private String reason;
    private String taskType;
    private String statusDetail;
    private String statusUuid;
    private String createdBy;
    private String createdByUuid;
    private String updatedByUuid;
    private String currentRoomNo;
    private String currentHostelId;
    private String currentHostelName;
    private TicketChipColorDto ticketChipColorDto;
}
