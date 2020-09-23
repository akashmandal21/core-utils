/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst", "gstAmount" })
public class AuditCategoryDto extends CategoryDto {

	boolean isPhysicalAudit;
	boolean isCctvAudit;

	private int cctvAuditCostPerBed;
	private int mgForCctvAudit;
	private int physicalAuditCostPerMonth;

	private int totalCctvAuditCostPerBed;
	private int totalPhysicalAuditCostPerBed;


	private int physicalAuditCharges;
	private int cctvAuditCharges;

}
