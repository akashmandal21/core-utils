/**
 * 
 */
package com.stanzaliving.core.bookingservice.dto.response;

import java.util.Date;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class UserStayDetailResponseDto {

	private String entityName;
	private String roomNumber;
	private String occupancy;
	private String paymentTerm;
	private Date contractStartDate;
	private Date contractEndDate;
	private String contractMonths;
	private double dues;
	
}
