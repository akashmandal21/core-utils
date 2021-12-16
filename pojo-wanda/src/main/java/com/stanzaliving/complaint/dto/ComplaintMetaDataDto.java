package com.stanzaliving.complaint.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.complaint.enums.EnumComplaintStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ComplaintMetaDataDto extends AbstractDto {

	private String userId;

	private EnumComplaintStatus complaintStatus;
	
	@NotBlank(message = "Complaint Type is Mandatory")
	private String complaintTypeUuid;

	@NotBlank(message = "Complaint Category is Mandatory")
	private String complaintCategoryUuid;

	private String description;

	@NotBlank(message = "Complaint Sub Category is Mandatory")
	private String complaintSubCategoryUuid;

	private Long cmsId;

	private String ticketRequesterEmail;

	private String userMobileNo;

	private String ticketAgentEmail;

	private String ticketAgentName;

	private String subject;

	private String userName;

	private List<ComplaintAttributeDto> complaintAttributeDtos;

	private String roomNo;

	private String hostelId;

	private List<String> complaintAttachmentUuids;
	
	private Date resolvedAt;

	private String resolvedOnComment;

	private Date closedAt;

	private String closedOnComment;
	
	private String cityName;
	
	private String microMarketName;
	
	private String houseName;
	
	private String firstName;
	
	private String lastName;
	
	private String userType;
	
	private Boolean satisfied;

	// added field to store ticket id for Support Service
	private String customTicketId;

}