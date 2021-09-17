package com.stanzaliving.website.dto;

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
public class FaqDto extends AbstractDto {

	private static final long serialVersionUID = 1L;
	
	private Long faqCategoryId;

	private String question;
	
	private String answer;
	
	private Integer displayOrder;
}
