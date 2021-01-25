/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 24-May-2020
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangelogResidenceVendorDto {

	private String residenceId;

	private String residenceName;

	private MealType mealType;

	private String mealTypeName;

	private String vendorId;

	private String vendorName;

	private LocalDate changedDate;

	private String changedBy;
}