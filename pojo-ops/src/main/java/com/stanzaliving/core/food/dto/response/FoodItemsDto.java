package com.stanzaliving.core.food.dto.response;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemsDto {

	private String mealName;

	private LocalDate orderDate;

	private Set<String> items;

}
