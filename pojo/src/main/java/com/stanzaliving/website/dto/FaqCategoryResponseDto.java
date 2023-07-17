package com.stanzaliving.website.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.user.enums.EnumListing;
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
public class FaqCategoryResponseDto extends AbstractDto {

	private static final long serialVersionUID = 1L;
	
	private String categoryName;
	
	private String slug;

	private Integer displayOrder;
	
	private FaqStatus faqStatus;
	
	private EnumListing<FaqStatus> faqStatusEnumListing;
	
	private List<FaqResponseDto> faqDtos;
	
	private Integer totalFaqCount;
}
