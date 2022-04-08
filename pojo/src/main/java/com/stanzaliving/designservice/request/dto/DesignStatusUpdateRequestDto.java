/**
 * 
 */
package com.stanzaliving.designservice.request.dto;

import com.stanzaliving.designservice.enums.DesignStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class DesignStatusUpdateRequestDto {

	private DesignStatus designStatus;
	private String estateUuid;
	private String designRemark;
	private String reasonForNoSumma;
	private String reasonForNoMagna;
	private String reasonForPrima;
}
