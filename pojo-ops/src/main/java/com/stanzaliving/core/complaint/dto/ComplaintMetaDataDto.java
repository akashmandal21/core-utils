/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.complaint.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.complaint.enums.EnumComplaintStatus;

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
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
@SuppressWarnings("serial")
public class ComplaintMetaDataDto extends AbstractDto {

	private String userId;
	private String description;
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
	private Date closedAt;
	private String closedOnComment;
	private String cityName;
	private String microMarketName;
	private String houseName;
	private String firstName;
	private String lastName;
	private String userType;
	private boolean satisfied;

	private EnumComplaintStatus complaintStatus;

	@NotBlank(message = "Complaint Category is Mandatory")
	private String complaintCategoryUuid;

	@NotBlank(message = "Complaint Sub Category is Mandatory")
	private String complaintSubCategoryUuid;
	
	private String complaintTypeUuid;

}
