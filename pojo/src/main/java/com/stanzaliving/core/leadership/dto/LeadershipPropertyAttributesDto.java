/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.Date;

import com.stanzaliving.core.estate.enums.EstateStatus;

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
public class LeadershipPropertyAttributesDto {

	private String estateUuid;

	private String estateName;

	private String cityName;

	private String microMarketName;

	private Integer beds;

	private Integer rooms;

	private long rentPerBed;

	private Date llHandoverDate;

	private Date addedOn;

	private String currentStatusDesc;

	private String colorCode;
	
	private EstateStatus currentStatus;
}
