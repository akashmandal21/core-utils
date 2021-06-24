package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDetailsDto {

    String assignedToUuid;

    String assignedTo;

    List<SubTicketDto> subTicketDto;

    List<TicketChecklistDetailDto> ticketChecklist;

    List<TagDto> tagDtos;

    TicketCardDto ticketCardDto;

    TeamDto teamDto;
}
