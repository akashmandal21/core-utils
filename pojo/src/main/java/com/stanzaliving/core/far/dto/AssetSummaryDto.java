package com.stanzaliving.core.far.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString
@NoArgsConstructor
@SuperBuilder
public class AssetSummaryDto {
	private Long totalAssets;
	private Long totalAssetsValue;
}