package com.stanzaliving.website.dto;

import javax.validation.constraints.NotNull;

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
public class FaqResponseDto extends AbstractDto {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "faqCategoryId cannot be null")
	private Long faqCategoryId;

	@NotNull(message = "question cannot be null")
	private String question;
	
	private String answer;
	
	private Integer displayOrder;
}
