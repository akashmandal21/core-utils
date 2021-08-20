package com.stanzaliving.wanda.intrest.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
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
public class InterestCategoryDto extends AbstractDto {

	private static final long serialVersionUID = 1L;

	private String name;

	private String image;

	private Integer displayOrder;

	@Builder.Default
	private Boolean isDraft = false;
	
	private Integer likes;
	
	private Integer totalInterests;
	
	private List<InterestDto> interestDtos;
	
	@Default
	private Boolean isSelected = false;
}
