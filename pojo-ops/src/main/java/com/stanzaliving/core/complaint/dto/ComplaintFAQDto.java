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

import java.io.Serializable;

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
public class ComplaintFAQDto implements Serializable {

	private String complaintFAQUuid;
	private String question;
	private String answer;
	private Integer sequenceId;
	private String residenceId;
	private String complaintCategoryTypeId;
	private String complaintcategoryTypeName;
	
	@Builder.Default
	private Boolean commonlyAskedQuestion = Boolean.FALSE;

	@Builder.Default
	private Boolean status = Boolean.TRUE;

}
