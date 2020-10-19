package com.stanzaliving.core.cafe.dto;

import java.util.Date;
import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.dto.response.ItemCategoryCountDto;

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
public class CafeMenuResponseDto extends AbstractDto{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cafeId;
	
	private String cafeName;
	
	private String cafeMenuId;
	
	private Date menuDate;

	private List<ItemCategoryCountDto> categoryCount;
		
	private List<CafeMenuItemsDto> cafeMenuItemDetailsDtoList;
	
	
}
