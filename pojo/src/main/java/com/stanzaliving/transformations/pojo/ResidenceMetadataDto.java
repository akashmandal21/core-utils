/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.pojo.CityMetadataDto.CityMetadataDtoBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMetadataDto {
	
	private long id;

	private String uuid;
	
	private String residenceName;
	
	private String residenceType;
	
	private String residenceBrand;

	private String microMarketId;
	
}
