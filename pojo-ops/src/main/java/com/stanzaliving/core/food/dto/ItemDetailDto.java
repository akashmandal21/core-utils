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
	@Builder.Default
	private Double itemGrammage = 0d;
	private String itemId;
	private String itemType;
	private String unit;
	private Double orderedWeight;
	private Double orderedQty;
	private String categoryId;
}
