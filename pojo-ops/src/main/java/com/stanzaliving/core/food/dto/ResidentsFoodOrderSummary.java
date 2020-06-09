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
public class ResidentsFoodOrderSummary {

	private String city;

	private String micromarket;

	private String residence;

	private String brand;

	private String gender;

	private Integer mir;

	private Double budgetPerMir;

	private Double expectedCostPerMir;

	private Boolean utilization;

}
