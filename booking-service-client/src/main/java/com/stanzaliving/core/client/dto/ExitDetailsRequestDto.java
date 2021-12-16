package com.stanzaliving.core.client.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExitDetailsRequestDto {

    @NotNull(message = "bookingUuid cannot be null")
    private String bookingUuid;

    private LocalDate moveOutDate;

    @Builder.Default
    private Boolean conditionsSelected = Boolean.FALSE;

    private String reasonForLeavingUuid;
}
