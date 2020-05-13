/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
 **/
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CityMetadataDto {

	private long id;

	private String uuid;

	private String cityName;
	
	private long stateId;
	
	private String stateUuid;
	
	private String cityCode;
	
	private double latitude;
	
	private double longitude;
	
}