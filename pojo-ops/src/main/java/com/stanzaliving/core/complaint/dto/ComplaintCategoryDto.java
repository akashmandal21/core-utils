/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.complaint.dto;

import com.stanzaliving.core.complaint.enums.ComplaintEligibility;

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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintCategoryDto {

	private String complaintCategoryUuid;
	private String name;
	private Boolean status;
	private String complaintTypeUuid;
	private ComplaintEligibility eligibility;

}
