package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.Status;
import com.stanzaliving.support.enums.TicketSlaStatus;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketCardColorDto {

    private TicketType ticketType;
    private Status statusName;
    private String statusUuid;
    private TicketSlaStatus ticketSla;
    private String cardBgColor;
    private String cardBorderColor;
    private String statusChipBgColor;
    private String statusChipTextColor;
    private String slaChipBgColor;
    private String slaChipTextColor;
}
