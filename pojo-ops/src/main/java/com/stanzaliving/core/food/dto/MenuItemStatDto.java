/**
 * 
 */
package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 01-May-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemStatDto extends MenuItemDto {

	private Integer delightedPercent;

	private Integer disgustedPercent;

	private Integer orderedInLastThreeDays;

	private Integer orderedInLastSevenDays;

	private Integer orderedInLastThirtyDays;
}