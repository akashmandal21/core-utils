package com.stanzaliving.core.utility.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class StatusReasonDto {
    private LocalDate time;
    @NotBlank(message = "Reason Cannot be blank")
    private String reason;
    private ReadingDto reading;
}
