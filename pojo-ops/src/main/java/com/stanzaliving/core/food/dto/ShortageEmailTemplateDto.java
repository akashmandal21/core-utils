/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class ShortageEmailTemplateDto {

	private String houseName;
	private String mealName;
	private String rcName;
	private String mobileNumber;
	private String residenceId;
	private String residenceMenuId;
	private String menuDate;
	
	private List<MealAndContainterCountDto> shortages;
}