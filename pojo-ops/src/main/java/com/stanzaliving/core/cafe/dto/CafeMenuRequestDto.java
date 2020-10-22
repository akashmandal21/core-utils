package com.stanzaliving.core.cafe.dto;

import java.util.Date;
import java.util.List;

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
public class CafeMenuRequestDto extends AbstractDto{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cafeId;
		
	private Date menuDate;
		
	private List<CafeMenuItemsDto> cafeMenuItemDetailsDtoList;
	
	
}
