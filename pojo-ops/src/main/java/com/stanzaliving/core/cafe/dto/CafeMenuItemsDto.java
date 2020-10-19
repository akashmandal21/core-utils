package com.stanzaliving.core.cafe.dto;

import javax.validation.constraints.NotBlank;

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
public class CafeMenuItemsDto  extends AbstractDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String itemId;
	
	private String itemName;
	
	@NotBlank(message = "Price filling is mandatory")
	private double itemPrice;
	
	private Integer availableInventoryCount;	
		
	private boolean enabled;
	
}

