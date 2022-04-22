/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.time.LocalDateTime;
import java.util.Date;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class QrScanSummaryResponseDto {

	private Date date;
	private String userId;
	private MealType mealType;
	private boolean veg;
	private String residenceId;


}