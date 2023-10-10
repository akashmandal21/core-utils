package com.stanzaliving.wanda.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintListingUIDtoV2 {

	private String userId;

	private String userName;

	private String mobileNo;

	private String roomNo;

	private String complaintUuid;

	private String complaintCategory;
	
	private String complaintSubCategoryName;

	private String complaintStatus;

	private String createdAt;

	private String closedAt;

	private String backgroundText;

	private String backgroundColor;
	
	private String complaintTypeName;
	
	private String complaintTypeImgUrl;
	
	private String cmsId;

	private Boolean satisfied;
	
	private String ticketStatus;
	
	private Boolean isResolved;

	private Date resolvedAt;

	private Boolean removeSatisfied;
}
