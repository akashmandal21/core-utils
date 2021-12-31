package com.stanzaliving.website.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.website.enums.FaqStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder.Default;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FaqCategoryRequestDto extends AbstractDto {

	private static final long serialVersionUID = 1L;
	
	private String categoryName;
	
	private String slug;

	private Integer displayOrder;
	
	@Default
	private FaqStatus faqStatus = FaqStatus.IN_DRAFT;
}
