package com.stanzaliving.core.leaddashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class LeadDetailsDto {
	private String leadTag;
	private String firstName;
	private String lastName;
	private int leadId;
	private String phone;
	private String leadType;
}
