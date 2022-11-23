package com.stanzaliving.complaint.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class FreshDeskDto {
	
	private String email;
	
	private String phone;
	
	private int status;
	
	private int priority;
	
	private int source;
	
	private String subject;
	
	private String description;
	
	private String name;
	
	@JsonProperty("custom_fields")
	private CustomFieldsDto customFieldsDto;

}
