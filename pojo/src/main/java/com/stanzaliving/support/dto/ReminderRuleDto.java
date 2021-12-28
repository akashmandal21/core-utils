package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.support.enums.ReminderActionType;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReminderRuleDto {

    private TicketType ticketType;
    private String primaryReferenceUuid;
    private AccessLevel accessLevel;
    private String referenceUuid;
    private Long sendReminderIn;
    private String sendReminderTo;
    private ReminderActionType sendReminderWhen;
    private String groupUuid;

}
