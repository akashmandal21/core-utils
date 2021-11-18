package com.stanzaliving.website.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FaqCategoryResponseDto extends AbstractDto {

	private static final long serialVersionUID = 1L;
	
	private String categoryName;
	
	private String slug;

	private Integer displayOrder;
	
	private List<FaqResponseDto> faqDtos;
	
	private Integer totalFaqCount;
}
