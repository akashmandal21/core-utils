/**
 * 
 */
package com.stanzaliving.core.bookingservice.dto.response;

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
	private String contractStartDate;
	private String contractEndDate;
	private String contractMonths;
	private double dues;
	
}
