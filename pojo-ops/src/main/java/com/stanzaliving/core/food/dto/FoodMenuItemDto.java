package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuItemDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String item;
	
	private FoodItemType foodPreference;
	
}
