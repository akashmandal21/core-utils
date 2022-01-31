package com.stanzaliving.community.brand.request;

import com.stanzaliving.community.brand.request.BrandRequestDto.BrandRequestDtoBuilder;
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
public class BrandDealsRequestDto extends AbstractDto{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long DealId;
	private String brandTitle;
	private String brandLogo;
	private String backgroundImage;
	private String promotionsInfo1;
	private String promotionsInfo2;
	private String cta_text;
	private UserList userList;
	private String csvUrl;
	private String locationUuid;
	private String genericCouponCode;
	private String redirectionUrl;
	private String startDate;
	private String endDate;

}
