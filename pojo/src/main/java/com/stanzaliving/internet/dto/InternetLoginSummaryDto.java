package com.stanzaliving.internet.dto;

import java.util.Set;

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
public class InternetLoginSummaryDto {

	private Set<String> studentIds;
	private String propertyId;
	private String residenceName;
	private Integer total;

}