/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.complaint.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class ComplaintFAQDto {

	private String complaintFAQUuid;
	private String question;
	private String answer;
	private Integer sequenceId;
	private String residenceId;
	private String complaintSubCategoryUuid;

	@Builder.Default
	private Boolean commonlyAskedQuestion = Boolean.FALSE;

	@Builder.Default
	private Boolean status = Boolean.TRUE;

}
