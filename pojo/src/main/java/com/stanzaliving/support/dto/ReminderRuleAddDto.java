package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReminderRuleAddDto {
    private TicketType ticketType;
    private List<String> primaryReferenceUuid;
    private AccessLevel accessLevel;
    private List<String> referenceUuid;
    private List<ReminderDetailsDto> reminderDetails;

}


