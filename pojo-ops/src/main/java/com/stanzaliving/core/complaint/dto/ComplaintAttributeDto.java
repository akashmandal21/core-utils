/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.complaint.dto;

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
public class ComplaintAttributeDto {

	private String complaintUuid;
	private String complaintAttributeUuid;
	private String complaintAttributeKey;
	private String complaintAttributeValue;
	private boolean status;

}
