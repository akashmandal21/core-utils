package com.stanzaliving.core.opscalculatorv2.dto;

import java.util.List;

import com.stanzaliving.core.opscalculator.dto.SMLevelInternetCategoryDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class InternetCategoryV2Dto extends CategoryV2Dto {
	
	private double internetPlanRate;
	private double MGOccupancyPercent;
	private int infraCharges;
	private int internetCharges;
	List<SMLevelInternetCategoryDto> smLevelInternetCategoryDtoList;
	@Builder.Default
	private String infoMessage = "Details have been automatically picked from the service mix version.";
}
