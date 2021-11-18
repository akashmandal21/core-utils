package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExitDetailsRequestDto {

    @NotNull(message = "bookingUuid cannot be null")
    private String bookingUuid;

    @NotNull(message = "Move out date cannot be null")
    private LocalDate moveOutDate;

    @Builder.Default
    private Boolean conditionsSelected = Boolean.FALSE;

    private String reasonForLeavingUuid;
}
