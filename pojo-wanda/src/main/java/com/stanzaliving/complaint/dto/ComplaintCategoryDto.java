package com.stanzaliving.complaint.dto;

import com.stanzaliving.complaint.enums.ComplaintEligibility;

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
public class ComplaintCategoryDto {

	private String complaintCategoryUuid;

	private String name;

	private ComplaintEligibility eligibility;

	private Boolean status;
	
	private String complaintTypeUuid;

}