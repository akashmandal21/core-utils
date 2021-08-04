package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.VasType;

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
public class VasMasterDto extends AbstractDto {

	private String name;

	private FoodItemType foodType;

	private VasType vasType;

	private Boolean eggPresent;

	private String category;

	private String description;

	private Double shelfLife;

	private Integer serves;

	private Double proposedPrice;

	private String imageId;

	private UnitOfMeasurement unitOfMeasurement;

	private Double grammagePerPax;

	private String dishId;

	private boolean dataComplete;
}
