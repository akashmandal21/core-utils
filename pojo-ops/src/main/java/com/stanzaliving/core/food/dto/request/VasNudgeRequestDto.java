/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;
import java.util.Set;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 25-Feb-2021
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasNudgeRequestDto {

	private Set<String> userIds;

	@NotNull(message = "Nudge Date is mandatory")
	private LocalDate nudgeDate;

	private Set<String> residenceIds;

	private Set<String> orderIds;

	private Boolean mailSendFlag;
}