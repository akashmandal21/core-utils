package com.stanzaliving.core.food.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDetailDto implements Serializable {
	private String itemName;
	private Integer itemQty;
	private String itemImg;
	private String itemId;
	private String itemType;
	private String categoryId;
	private Double itemGrammage;
	private Integer orderedQty;
	private Double orderedWeight;
	private String unit;
}
