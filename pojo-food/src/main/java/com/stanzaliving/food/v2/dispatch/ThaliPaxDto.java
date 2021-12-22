package com.stanzaliving.food.v2.dispatch;

import com.stanzaliving.core.food.enums.FoodServeType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ThaliPaxDto {

	private String thaliId;

	private String name;

	private Integer veg;

	private Integer nonVeg;

	private Integer nsl;

	private FoodServeType foodServeType;

}
