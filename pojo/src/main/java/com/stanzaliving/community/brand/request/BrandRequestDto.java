package com.stanzaliving.community.brand.request;

import com.stanzaliving.community.request.AddEventCategoryDTO;
import com.stanzaliving.community.request.AddEventCategoryDTO.AddEventCategoryDTOBuilder;
import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandRequestDto extends AbstractDto {
	
	private static final long serialVersionUID = 1L;

	private String brandName;
	
	private String brandUrl;
	
	private String description;

}
