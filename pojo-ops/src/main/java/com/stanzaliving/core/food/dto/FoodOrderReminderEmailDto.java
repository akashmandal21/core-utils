/**
 * 
 */
package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 4 Aug, 2020
 *
 **/
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderReminderEmailDto {

	private String cityId;

	private String cityName;

	private String microMarketId;

	private String microMarketName;

	private String residenceId;

	private String residenceName;
}