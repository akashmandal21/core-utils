package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketChipColorDto {
    private String ticketCardBgColor;
    private String ticketCardBorderColor;
    private String ticketStatusChipBgColor;
    private String ticketStatusChipTextColor;
    private String slaChipBgColor;
    private String slaChipTextColor;
}
