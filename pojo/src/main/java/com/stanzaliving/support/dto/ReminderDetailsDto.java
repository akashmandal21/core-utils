package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.ReminderActionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReminderDetailsDto {
    private Long sendReminderIn;
    private String sendReminderTo;
    private ReminderActionType sendReminderWhen;

}
