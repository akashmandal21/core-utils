/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.v1.dto;

import com.stanzaliving.core.opscalculator.dto.CategoryDto;

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
public class AuditCategoryV1Dto extends CategoryDto {

	boolean isPhysicalAudit;
	boolean isCctvAudit;
	boolean isSafePlaceAudit;
	
	public double cctvAuditCostPerBed;
	public double physicalAuditCostPerBed;
	public double safePlaceAuditCostPerBed;
	
	public int mgForCctvAudit;
	public double physicalAuditCostPerMonth;
	public double cctvAuditCostPerMonthRate;
	public double safePlaceAuditCostPerMonth;
	

	private int totalCctvAuditCostPerBed;
	public int totalPhysicalAuditCostPerBed;


	public int physicalAuditCharges;
	public int cctvAuditCharges;

	public AuditCategoryV1Dto clone() {
		return AuditCategoryV1Dto.builder()
				.isPhysicalAudit(this.isPhysicalAudit)
				.isCctvAudit(this.isCctvAudit)
				.isSafePlaceAudit(this.isSafePlaceAudit)
				.cctvAuditCostPerBed(this.cctvAuditCostPerBed)
				.mgForCctvAudit(this.mgForCctvAudit)
				.physicalAuditCostPerMonth(this.physicalAuditCostPerMonth)
				.cctvAuditCostPerMonthRate(this.cctvAuditCostPerMonthRate)
				.safePlaceAuditCostPerMonth(this.safePlaceAuditCostPerMonth)
				.totalCctvAuditCostPerBed(this.totalCctvAuditCostPerBed)
				.totalPhysicalAuditCostPerBed(this.totalPhysicalAuditCostPerBed)
				.physicalAuditCharges(this.physicalAuditCharges)
				.cctvAuditCharges(this.cctvAuditCharges)
				.categoryName(this.categoryName)
				.costPerAvailableBed(this.costPerAvailableBed)
				.costPerOccupiedBed(this.costPerOccupiedBed)
				.contribution(this.contribution)
				.enabled(this.enabled)
				.build();
	}
}
