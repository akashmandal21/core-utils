package com.stanzaliving.core.food.dto;

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
public class FoodMenuApprovalSummaryDto {

	private String cityName;

	private String micromarketName;

	private String categoryName;

	private boolean autoCreated;

	private boolean chefAutoApproved;

	private boolean vendorAutoApproved;
}
