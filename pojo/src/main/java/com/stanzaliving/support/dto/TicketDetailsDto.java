package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDetailsDto {

    String assignedTo;

    List<String> attachmentDto;

    List<SubTicketDto> subTicketDto;

    List<TicketChecklistDetailDto> ticketChecklist;

    List<TagDto> tagDtos;

    TeamDto teamDto;
}
