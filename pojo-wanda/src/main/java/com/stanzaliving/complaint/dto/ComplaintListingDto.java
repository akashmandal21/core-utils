package com.stanzaliving.complaint.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class ComplaintListingDto {

	private String userId;

	private String complaintCategory;

	private String mobileNo;

	private String roomNo;

	private Date created;

	private Date closedAt;

	private String complaintUuid;

	private String complaintStatus;

	private String userName;
	
	@Builder.Default
	private Boolean satisfied = Boolean.FALSE;

}