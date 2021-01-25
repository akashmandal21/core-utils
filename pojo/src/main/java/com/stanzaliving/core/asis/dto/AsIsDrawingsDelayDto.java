package com.stanzaliving.core.asis.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Represents the AsIsDrawingsDelay attributes.
 * 
 * @author debendra.dhinda
 * @since 22-Jan-2020
 * */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AsIsDrawingsDelayDto implements Serializable{

	private static final long serialVersionUID = 1213124159235L;
	
	@NotBlank(message = "ASIS UUID can't be empty.")
	private String asIsUuid;
	@NotBlank(message = "Completion date can't be empty.")
	private String newCompletionDate;
	
	@NotBlank(message = "Dealy reason can't be empty.")
	private String delayReason;

}
