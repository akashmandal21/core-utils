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
public class ComplaintAttributeDto {

	private String complaintUuid;

	private String complaintAttributeUuid;

	private String complaintAttributeKey;

	private String complaintAttributeValue;

	private boolean status;

}