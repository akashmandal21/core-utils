/**
 * @author manish.pareek
 *
 */
package com.stanzaliving.core.opscalculatorv2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class AuditCategoryV2Dto extends CategoryV2Dto {

	private boolean isPhysicalAudit;
	private boolean isCctvAudit;
	private boolean isSafePlaceAudit;
	
	private double cctvAuditCostPerBed;
	private double physicalAuditCostPerBed;
	private double safePlaceAuditCostPerBed;
	
	private int mgForCctvAudit;
	private double physicalAuditCostPerMonth;
	private double cctvAuditCostPerMonthRate;
	private double safePlaceAuditCostPerMonth;
	

	private int totalCctvAuditCostPerBed;
	private int totalPhysicalAuditCostPerBed;

	private int cctvAuditRateMultiplier;


	public AuditCategoryV2Dto clone() {
		return AuditCategoryV2Dto.builder()
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
				.categoryName(this.categoryName)
				.costPerAvailableBed(this.costPerAvailableBed)
				.costPerOccupiedBed(this.costPerOccupiedBed)
				.contribution(this.contribution)
				.enabled(this.enabled)
				.build();
	}
}
