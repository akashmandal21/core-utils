/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.complaint.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

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
public class ComplaintListingDtoV2 {

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
	private String complaintTypeName;
	private String complaintTypeImgUrl;
	private String cmsId;

}
