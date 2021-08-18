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

    private String assignedToUuid;

    private String assignedTo;

    private List<SubTicketDto> subTicketDtoList;

    private List<TicketChecklistDetailDto> ticketChecklistDetailDtoList;

    private List<TagDto> tagDtoList;

    private TicketCardDto ticketCardDtoList;

    private TeamDto teamDto;

    private TicketChipColorDto ticketChipColorDto;
}
