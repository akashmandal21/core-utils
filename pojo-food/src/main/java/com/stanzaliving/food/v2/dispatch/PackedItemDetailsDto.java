package com.stanzaliving.food.v2.dispatch;

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
public class PackedItemDetailsDto {

	private String itemId;

	private String itemName;

	private Integer groupNumber;

	private String grammage;

	private Double grammageValue;

	private String unitOfMeasurement;

	private String quantity;

	private Integer quantityValue;
}
