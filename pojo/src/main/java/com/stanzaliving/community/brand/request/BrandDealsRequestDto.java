package com.stanzaliving.community.brand.request;

import java.util.List;

import com.stanzaliving.banner.enumeration.AppPage;
import com.stanzaliving.community.brand.request.BrandRequestDto.BrandRequestDtoBuilder;
import com.stanzaliving.community.enums.EventStatus;
import com.stanzaliving.community.enums.UserList;
import com.stanzaliving.community.request.UserListDTO;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandDealsRequestDto extends AbstractDto {
	private static final long serialVersionUID = 1L;

	private long DealId;
	private String brandName;
	private String brandLogo;
	private String backgroundImage;
	private String dealDescription;
	private String dealInfo;
	private String primaryCta;
	private String secondaryCta;
	private UserList userList;
	private String csvUrl;
	private String locationUuid;
	private String genericCouponCode;
	private String redirectionUrl;
	private String startDate;
	private String endDate;
	
	private EnumListing<EventStatus> postStatusDto;
	private List<EnumListing<AppPage>> appPagesDto;
	private UserListDTO userListDto;
	private String title;
	private String postId;
	private String description;
	private String ctaText;
	private String redirectLink;
	private Integer priority;
	protected boolean prompted;
}
