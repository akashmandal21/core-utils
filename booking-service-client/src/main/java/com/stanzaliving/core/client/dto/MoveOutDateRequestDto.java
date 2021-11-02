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
public class MoveOutDateRequestDto {

    @NotNull(message = "bookingUuid cannot be null")
    private String bookingUuid;

    private LocalDate moveOutDate;

    @Builder.Default
    private Boolean isTresspasser = Boolean.FALSE;

    @Builder.Default
    private Boolean isOverrideEnabled = Boolean.FALSE;
}
