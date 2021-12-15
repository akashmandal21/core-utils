
package com.stanzaliving.vms.response.dto;

import java.util.Collection;
import java.util.Date;

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
public class ServiceProviderMappingListingDto {
	
	private String residenceId;
	private String residenceName;

	private String micromarketId;
	private String micromarketName;

	private String cityId;
	private String cityName;

	private long servicesProvidedCount;
	private Collection<String> servicesProvidedInfoList;
	private long serviceProvidersCount;
	private Collection<String> serviceProvidersInfoList;
	private String statusName;
	private boolean status;
	private Date lastUpdatedAt;
	private String lastUpdatedBy;

}
