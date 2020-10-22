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

	private String complaintCategory;

	private String complaintSubCategory;

	private List<ComplaintAttributeDto> complaintAttributeDtos;

	private List<String> attachmentUrl;

	private Date closedOn;

	private String closedOnComment;

}