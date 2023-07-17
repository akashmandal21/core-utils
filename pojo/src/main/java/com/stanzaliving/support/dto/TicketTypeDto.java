package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketTypeDto {

    private  boolean isExternal;

    private boolean isInternal;

    private boolean isSubTicket;

    private boolean isTicket;

    private boolean isServiceTask;

}
