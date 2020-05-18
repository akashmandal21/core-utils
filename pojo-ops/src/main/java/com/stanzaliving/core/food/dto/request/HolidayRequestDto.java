package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.enums.HolidayType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HolidayRequestDto {

	@NotBlank(message = "residenceId Cannot be blank")
	private String residenceId;

	@NotNull(message = "date cannot be null")
	private LocalDate date;
	
	private HolidayType holidayType;

	private String description;

}
