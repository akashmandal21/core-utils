/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
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
public class AuditCategoryDto extends CategoryDto {

	boolean isPhysicalAudit;
	boolean isCctvAudit;

	private double cctvAuditCostPerBed;
	private int mgForCctvAudit;
	private double physicalAuditCostPerMonth;

	private int totalCctvAuditCostPerBed;
	private int totalPhysicalAuditCostPerBed;


	private int physicalAuditCharges;
	private int cctvAuditCharges;

	public AuditCategoryDto clone() {
		return AuditCategoryDto.builder()
				.isPhysicalAudit(this.isPhysicalAudit)
				.isCctvAudit(this.isCctvAudit)
				.cctvAuditCostPerBed(this.cctvAuditCostPerBed)
				.mgForCctvAudit(this.mgForCctvAudit)
				.physicalAuditCostPerMonth(this.physicalAuditCostPerMonth)
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
