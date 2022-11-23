package com.stanzaliving.complaint.dto;

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
public class ComplaintSubCategoryDto {

	private String complaintSubCategoryUuid;

	private String name;

	private String complaintCategoryUuid;

	private Boolean status;
}