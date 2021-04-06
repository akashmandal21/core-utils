/**
 * 
 */
package com.stanzaliving.core.food.dto.response;

import java.io.Serializable;
import java.util.Date;

import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 13-Jan-2021
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserMealOrderDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;

	private String userName;

	private String roomNumber;

	private String mobile;

	private String imageUrl;

	private Date pickedAt;

	private boolean preferedMealPicked;

	private String pickedMealName;

	private FoodItemType pickedMealPreference;

	private boolean preferenceGiven;

	private String preferedMealName;

	private FoodItemType preferedMealPreference;

}