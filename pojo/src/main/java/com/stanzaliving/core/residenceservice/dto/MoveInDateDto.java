package com.stanzaliving.core.residenceservice.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

import com.stanzaliving.booking.enums.BookingType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
