/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.time.LocalDateTime;

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

	private LocalDateTime foodScanLastDate;
	private String userId;
	private String qrContextType;
	private MealType mealType;

}