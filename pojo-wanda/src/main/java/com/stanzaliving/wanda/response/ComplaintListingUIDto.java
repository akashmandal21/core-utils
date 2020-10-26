package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintListingUIDto {

	private String userId;

	private String userName;

	private String mobileNo;

	private String roomNo;

	private String complaintUuid;

	private String complaintCategory;

	private String complaintStatus;

	private String createdAt;

	private String closedAt;

	private String backgroundText;

	private String backgroundColor;
	
	private String complaintTypeName;
	
	private String complaintTypeImgUrl;

}
