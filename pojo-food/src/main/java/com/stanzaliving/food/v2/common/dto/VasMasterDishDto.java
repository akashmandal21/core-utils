package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

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
public class VasMasterDishDto extends AbstractDto {

	private static final long serialVersionUID = -2166901731936225606L;
	private String vasMasterId;
	private String dishId;
	private Double grammageAmount;
	private Double grammageQty;
	private boolean accompaniment;
	
}
