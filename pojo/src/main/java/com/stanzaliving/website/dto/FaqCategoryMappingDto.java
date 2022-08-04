package com.stanzaliving.website.dto;

import javax.validation.constraints.NotNull;

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
public class FaqCategoryMappingDto {
	
	private Long faqCategoryId;
	
	@NotNull(message = "displayOrder cannot be null")
	private Integer displayOrder;
}
