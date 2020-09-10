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
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst" })
public class PersonnelCategoryDto extends CategoryDto {

	private boolean rcStaffAvailable;
	private int rcStaffCount;
	private int rcRatePerMonth;
	private boolean oeStaffAvailable;
	private int oeStaffCount;
	private int oeRatePerMonth;

	private int personnelRcCharges;
	private int personnelOeCharges;

}
