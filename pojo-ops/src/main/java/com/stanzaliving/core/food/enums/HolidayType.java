/**
 * 
 */
package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 17-Apr-2020
 *
 **/
@Getter
@AllArgsConstructor
public enum HolidayType {

	NATIONAL("National"),
	LOCAL("Local"),
	WEEK_END("Week End"),
	FESTIVAL("Festival"),
	EXAM("Exam"),
	OTHER("Other");

	private String holidayName;
}