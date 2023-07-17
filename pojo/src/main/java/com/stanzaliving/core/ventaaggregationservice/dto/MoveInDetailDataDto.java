package com.stanzaliving.core.ventaaggregationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MoveInDetailDataDto {

	private String bookingUuid;
	private String bookingResidenceType;
	private String residentId;
	private String residenceUuid;
	private String residenceName;
	private Integer noOfBeds;
	private String bookingStatus;
	private Date contractStartDate;
	private Date contractEndDate;
	private Date moveInDate;
	private Date cancelDate;

}
