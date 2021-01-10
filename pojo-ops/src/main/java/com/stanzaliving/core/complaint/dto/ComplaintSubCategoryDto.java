/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.complaint.dto;

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
public class ComplaintSubCategoryDto {

	private String complaintSubCategoryUuid;
	private String name;
	private String complaintCategoryUuid;
	private Boolean status;

}
