package com.stanzaliving.complaint.dto;

import java.util.Date;
import java.util.List;

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
public class ComplaintSummaryDto {

	private String complaintType;

	private String complaintTypeImgUrl;

	private String complaintCategory;

	private String complaintSubCategory;

	private List<ComplaintAttributeDto> complaintAttributeDtos;

	private List<String> attachmentUrl;

	private String etr;

	private Date closedOn;

	private String closedOnComment;

	private Date createdOn;

	private Long cmsId;

}