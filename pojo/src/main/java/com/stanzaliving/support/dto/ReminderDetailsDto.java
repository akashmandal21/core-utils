package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.ReminderActionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReminderDetailsDto {
    @NotNull(message = "sendReminderIn can't be left blank.")
    private Long sendReminderIn;
    @NotNull    (message = "sendReminderWhen can't be left blank.")
    private ReminderActionType sendReminderWhen;

}
