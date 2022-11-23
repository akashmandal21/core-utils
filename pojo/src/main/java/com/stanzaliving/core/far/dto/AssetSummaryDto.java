package com.stanzaliving.core.far.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Setter
@Getter
@ToString
@NoArgsConstructor
@SuperBuilder
public class AssetSummaryDto {
	private Long totalAssets;
	private BigDecimal totalAssetsValue;
}