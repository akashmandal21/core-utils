package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OrderReceiveBasePreferenceDto {
	
	private String vegDispatchSummaryitemsId;

	private String basePreference;

	private Integer vegActual;
	
	@Builder.Default
	private Integer vegExpected=0;
	
	private String nonvegDispatchSummaryitemsId;

	private Integer nonvegActual;

	@Builder.Default
	private Integer nonvegExpected=0;

}
