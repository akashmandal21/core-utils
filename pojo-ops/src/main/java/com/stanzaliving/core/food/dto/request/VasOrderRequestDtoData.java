package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.tuple.Pair;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class VasOrderRequestDtoData {
	
	@NotNull(message = "Please choose item and quantity.") 
	private List<Pair<String, Integer>> itemIdsAndQuantity;
	
	@NotNull(message = "Please specify residence.") 
	private String residenceFoodMenuId;

}