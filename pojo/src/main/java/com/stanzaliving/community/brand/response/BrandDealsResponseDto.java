package com.stanzaliving.community.brand.response;

import java.util.List;

import com.stanzaliving.banner.enumeration.AppPage;
import com.stanzaliving.community.brand.request.BrandDealsRequestDto;
import com.stanzaliving.community.brand.request.BrandDealsRequestDto.BrandDealsRequestDtoBuilder;
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
public class BrandDealsResponseDto extends AbstractDto {
	
	private static final long serialVersionUID = 1L;

	private int page;

	private int records;

	private int totalPages;

	private long totalRecords;
	
	private String userId;
	
	private String userCode;
	
	private AppPage appPage;
	
	private List<BrandDealsRequestDto> brandDealsRequestDto;

}
