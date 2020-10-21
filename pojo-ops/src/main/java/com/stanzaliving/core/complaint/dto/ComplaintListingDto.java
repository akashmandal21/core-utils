/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.complaint.dto;

import java.util.Date;

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
public class ComplaintListingDto {

	private String userId;
	private String userName;
	private String mobileNo;
	private String roomNo;
	private String complaintUuid;
	private String complaintCategory;
	private String complaintStatus;
	private Date created;
	private Date closedAt;
	@Builder.Default
	private Boolean satisfied = Boolean.FALSE;

}
