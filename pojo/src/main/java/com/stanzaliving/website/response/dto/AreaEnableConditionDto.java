package com.stanzaliving.website.response.dto;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AreaEnableConditionDto {

	boolean canBeEnabled;

	private List<String> errorStatements;
}
