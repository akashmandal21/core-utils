package com.stanzaliving.core.food.dto.response;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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
public class KitchenFoodOrderDto {

	private String vendorName;

	private LocalDate orderDate;

	private List<KitchenOrderMealDto> meals;

	private boolean isOrdered;

	private Date lastUpdatedAt;

}