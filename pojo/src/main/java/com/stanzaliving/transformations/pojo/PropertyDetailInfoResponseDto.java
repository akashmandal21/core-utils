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
public class PropertyDetailInfoResponseDto {

	
	private int area;
	private long cityId;
	private String cityName;
	private String brandName;
	private int roomCount;
	private int bedCount;
	private String propertyName;
	private String micromarketName;	
	private int attachedWashroom;
	private int attachedBalcony;
	private BoqStatus boqStatus;
	private String projectManagerName;
	private String projectManagerEmail;
	private String projectManagerPhoneNumber;
}
