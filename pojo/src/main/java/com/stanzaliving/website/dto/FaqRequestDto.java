package com.stanzaliving.website.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.website.enums.FaqStatus;

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
public class FaqRequestDto extends AbstractDto {

	private static final long serialVersionUID = 1L;

	private List<FaqCategoryMappingDto> faqCategoryMappingDtos;

	@NotNull(message = "question cannot be null")
	private String question;

	private String answer;
	
	private FaqStatus faqStatus;
}
