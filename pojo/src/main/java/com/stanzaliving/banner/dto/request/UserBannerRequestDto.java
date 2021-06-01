package com.stanzaliving.banner.dto.request;

import com.stanzaliving.banner.enumeration.AppPage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserBannerRequestDto {

	private String userCode;
	private AppPage appPage;
	private String cityUuid;
	private String micromarketUuid;
	private String residenceUuid;
}
