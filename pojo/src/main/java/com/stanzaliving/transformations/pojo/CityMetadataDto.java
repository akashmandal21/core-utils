/**
 *
 */
package com.stanzaliving.transformations.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
 **/
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CityMetadataDto implements Serializable {

	private long id;

	private String uuid;

	private String cityName;

	private long stateId;


	private String zoneUuid;

	
	private String stateUuid;
	

	private String cityCode;

	private double latitude;

	private double longitude;
	private boolean medullaEligible;

}