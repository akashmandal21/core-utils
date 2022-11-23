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

import java.util.ArrayList;
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

	@Builder.Default
	private SecurityType securityType = SecurityType.IN_HOUSE_SECURITY;
	private double employeeCount;
	private int ratePerMonth;

	private int securityCharges;
	private int inHouseSecurityCharges;

	@Builder.Default
	private List<DropDownDto> securityTypeOptions = new ArrayList<>();


	@Builder.Default
	private int gst = Constants.GST_SECURITY_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_SECURITY_PERCENT;

}
