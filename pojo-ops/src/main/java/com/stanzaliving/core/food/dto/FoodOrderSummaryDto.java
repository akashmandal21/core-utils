package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.estate.enums.EstateGender;

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
public class FoodOrderSummaryDto {

	private String city;

	private String micromarket;

	private String residence;

	private ResidenceBrand brand;

	private EstateGender gender;

	private Integer mir;

	private Double budgetPerMir;

	private Double expectedCostPerMir;

	private Boolean utilization;

}