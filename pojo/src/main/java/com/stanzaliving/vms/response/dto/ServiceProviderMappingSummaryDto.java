
package com.stanzaliving.vms.response.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.PageResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author manish.pareek
 * @date 02/12/21
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ServiceProviderMappingSummaryDto {
	private List<QuickFilterCountDto> stats;
	private PageResponse<ServiceProviderMappingListingDto> serviceProviderMappingListingDto;
}
