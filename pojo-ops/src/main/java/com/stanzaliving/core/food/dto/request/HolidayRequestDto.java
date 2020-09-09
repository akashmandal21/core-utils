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

	@NotBlank(message = "Residence Id Cannot be blank")
	private String residenceId;

	@NotNull(message = "Holiday date cannot be null")
	private LocalDate date;

	private HolidayType holidayType;

	@NotNull(message = "Holiday flag is mandatory")
	private Boolean holiday;

	private String description;

}