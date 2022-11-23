package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubTicketDetailsDto {

    private TicketCardDto ticketCardDto;

    private SubTicketDto subTicketDto;
}
