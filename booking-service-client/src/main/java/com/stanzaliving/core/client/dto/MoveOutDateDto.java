package com.stanzaliving.core.client.dto;


import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoveOutDateDto {

    @NotNull(message = "bookingUuid cannot be null")
    private String bookingUuid;

    private LocalDate moveOutDate;
}
