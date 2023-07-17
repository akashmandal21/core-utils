/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import java.util.Date;

import com.stanzaliving.designservice.enums.DesignStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class PropertyBedCountResponseDto {

	private String estateUuid;
	private Integer noOfRooms;
	private int bdBedCount;
	private int primaBed;
	private int magnaBed;
	private int summaBed;
	private String designRemark;
	private String reasonForPrima;
	private String reasonForNoMagna;
	private String reasonForNoSumma;
	private DesignStatus designStatus;
	private String designDescription;
	private Date updatedAt;
	private String competitorName;
	private int leasedArea;
	@Temporal(TemporalType.TIMESTAMP)
	private Date propertyApprovalTime;
}
