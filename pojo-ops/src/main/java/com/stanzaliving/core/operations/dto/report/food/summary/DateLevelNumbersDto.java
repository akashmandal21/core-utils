/**
 * 
 */
package com.stanzaliving.core.operations.dto.report.food.summary;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 24-Jan-2020
 *
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class DateLevelNumbersDto {

	private int present;

	private int occupiedBeds;

	private int movedInResidents;
	
	private int activeMeals;

	private String residenceUuid;

	private String micromarketUuid;

	private String cityUuid;

	private LocalDate eventDate;
}