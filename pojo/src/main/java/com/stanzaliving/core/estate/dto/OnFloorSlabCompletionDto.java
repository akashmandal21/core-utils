/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import lombok.ToString;

import lombok.Getter;
import lombok.Setter;

/**
 * @author raj.kumar
 *
 */
@Getter
@ToString
@Setter
public class OnFloorSlabCompletionDto {

	private String optionValue;
	private Double signingAmountBTS;
	private Integer monthsFromExecutionDateBTS;
}
