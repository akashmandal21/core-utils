package com.stanzaliving.community.brand.request;

import com.stanzaliving.community.enums.UserList;
import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandDealLocationMappingRequestDto extends AbstractDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dealUuid;
	private String location;
	private String locationUuid;

}
