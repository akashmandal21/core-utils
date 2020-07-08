/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

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
public class ChangelogResidenceCategoryDto {

	private String residenceId;

	private String residenceName;

	private String menuCategoryId;

	private String menuCategoryName;

	private LocalDate changedDate;

	private String changedBy;
	
	private String action;
}