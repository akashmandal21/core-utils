/**
 * 
 */
package com.stanzaliving.transformations.pojo;

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
public class PropertyDetailInfo {

	private Integer roomCount;
	private Integer bedCount;
	private String cityName;
	private String brandName;
	private String propertyName;
	private String micromarketName;	
	private String projectManagerName;
	private String projectManagerEmail;
	private String projectManagerPhoneNumber;
}
