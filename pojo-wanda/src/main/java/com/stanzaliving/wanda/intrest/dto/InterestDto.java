package com.stanzaliving.wanda.intrest.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InterestDto extends AbstractDto{

	private static final long serialVersionUID = 1L;

	private String name;
	
	private String image;
	
	private Integer displayOrder;
	
	@Builder.Default
	private Boolean isDraft = false;
}
