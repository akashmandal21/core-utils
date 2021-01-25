/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import java.util.Date;

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
public class PropertyDto {

	private String estateUuid;
	private String propertyName;
	private String cityName;
	private String micromarketName;
	private Integer noOfBeds;
	private Integer noOfRooms;
	private boolean commercialApproved;
	private String handoverDate;
	private Date submittedOn;
	private String addedBy;
	private String colorCode;
	private String houseName;
}
