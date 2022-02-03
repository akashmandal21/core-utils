package com.stanzaliving.community.brand.request;

import com.stanzaliving.community.enums.EventStatus;
import com.stanzaliving.community.enums.UserList;
import com.stanzaliving.community.request.UserListDTO;
import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandDealsRequestDto extends AbstractDto {
	
	private static final long serialVersionUID = 1L;

	private String brandName;
	
	@Default
	private EventStatus dealStatus = EventStatus.IN_DRAFT;

	private String brandLogo;
	
	private String backgroundImage;
	
	private String dealDescription;
	
	private String dealInfo;
	
	private String primaryCtaText;
	
	private String secondaryCtaText;
	
	@Default
	private UserList userList = UserList.ALL;
	
	private UserListDTO userListDto;
	
//	private String csvUrl;
	
//	private String locationUuids;
	
	private String genericCouponCode;
	
	private String redirectionUrl;
	
	private String startDate;
	
	private String endDate;
}
