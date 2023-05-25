package com.stanzaliving.core.food.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDetailDto {
	private String itemName;
	private Integer itemQty;
	private String itemImg;
	private String itemId;
	private String itemPreferenceCount;
	private String itemType;
	private String itemGrammage;
	private String orderedQty;
	private String orderedWeight;
	private String unit;
}
