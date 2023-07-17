package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.booking.enums.BookingType;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MoveInDateDto {
    @Enumerated(EnumType.STRING)
    private BookingType residentType;
    @NotBlank(message = "Move-in date cannot be empty")
    private String moveInDate;
}
