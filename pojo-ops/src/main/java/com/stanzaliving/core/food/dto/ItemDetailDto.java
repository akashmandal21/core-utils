package com.stanzaliving.core.food.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemDetailDto implements Serializable {

	private static final long serialVersionUID = 1L;

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
