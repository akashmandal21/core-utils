package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MarkDelaySubTicketDto {
    @NotBlank(message = "Reason cannot be null")
    private String reason;
    @NotNull(message = "Completion date cannot be null")
    private Date tentativeDate;
}
