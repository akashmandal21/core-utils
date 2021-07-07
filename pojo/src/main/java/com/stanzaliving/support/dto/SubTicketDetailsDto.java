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
public class SubTicketDetailsDto {

    private TicketCardDto ticketCardDto;

    private List<TicketMessageDto> ticketMessageDto;

    private SubTicketDto subTicketDto;
}
