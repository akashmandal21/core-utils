package com.stanzaliving.website.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

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
public class FaqCategoryDto extends AbstractDto {

	private static final long serialVersionUID = 1L;
	
	private String categoryName;
	
	@NotBlank(message = "Category Slug is Mandatory")
	private String slug;

	private Integer displayOrder;
	
	private List<FaqDto> faqDtos;
	
	private Integer totalFaqCount;
}
