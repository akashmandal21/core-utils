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

    @Builder.Default
    private  boolean isExternal = false;

    @Builder.Default
    private boolean isInternal = false;

    @Builder.Default
    private boolean isSubTicket = false;

    @Builder.Default
    private boolean isTicket = false;

    @Builder.Default
    private boolean isServiceTask = false;

}
