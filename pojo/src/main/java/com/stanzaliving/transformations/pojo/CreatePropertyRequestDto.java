/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.enums.BoqStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class CreatePropertyRequestDto {

	private String propertyName;
	private String propertyUuid;
	private String estateId;
	private int bedCount;
	private int roomCount;
	private int area;
	private long cityId;
	private String cityName;
	private long micromarketId;
	private String micromarketName;
	private double capexEstimate;
	private double boqEstimate;
	private String projectStatus;
	private String brandName;
	private String projectManagerAssigned;
	private Integer attachedWashroom;
	private Integer attachedBalcony;
	private BoqStatus boqStatus;
}
