/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.opscalculator.constants.Constants;

import com.stanzaliving.core.opscalculator.enums.SecurityType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
@JsonIgnoreProperties({ "utilization" })
public class SecurityCategoryDto extends CategoryDto {

	private SecurityType securityType;
	private int employeeCount;
	private double ratePerMonth;

	private Integer securityCharges;
	private Integer inHouseSecurityCharges;

	private List<WaterTankerSlotDetail.DropDownDto> securityTypeOptions = SecurityType.getAllServiceTypeValues();


	@Builder.Default
	private int gst = Constants.GST_SECURITY_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_SECURITY_PERCENT;

}
