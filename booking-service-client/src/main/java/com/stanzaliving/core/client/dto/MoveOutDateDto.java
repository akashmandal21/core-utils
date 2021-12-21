package com.stanzaliving.core.client.dto;

import com.stanzaliving.booking.enums.BookingSubStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoveOutDateDto {

    @NotNull(message = "bookingUuid cannot be null")
    private String bookingUuid;

    private LocalDate moveOutDate;
}
