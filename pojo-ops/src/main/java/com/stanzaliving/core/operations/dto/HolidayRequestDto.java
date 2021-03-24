package com.stanzaliving.core.operations.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HolidayRequestDto {

	@NotBlank(message = "Residence Uuid is Mandatory")
	private String residenceUuid;
	private List<LocalDate> addHolidayDates;
	private List<LocalDate> removeHolidayDate;

}
