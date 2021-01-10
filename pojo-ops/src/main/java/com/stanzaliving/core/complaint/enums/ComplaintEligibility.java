/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.complaint.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum ComplaintEligibility {

	VENTA("Venta"),
	CORE("Core");

	private String eligibility;

}