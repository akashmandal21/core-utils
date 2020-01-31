/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 22-Jan-2020
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HolidayDto {

	@NotNull(message = "Holiday Date is Mandatory")
	private LocalDate holidayDate;

	@NotBlank(message = "Holiday Name is Mandatory")
	private String holidayName;
}