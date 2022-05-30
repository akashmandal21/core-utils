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
public class MoveOutDateRequestDto {

    @NotNull(message = "bookingUuid cannot be null")
    private String bookingUuid;

    @NotNull(message = "moveout date cannot be null")
    private LocalDate moveOutDate;

    @Builder.Default
    private Boolean isTresspasser = Boolean.FALSE;

    @Builder.Default
    private Boolean isOverrideEnabled = Boolean.FALSE;
}
