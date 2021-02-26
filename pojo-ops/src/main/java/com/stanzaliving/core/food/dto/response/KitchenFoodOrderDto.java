package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.dto.KitchenOrderMealRequestDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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
