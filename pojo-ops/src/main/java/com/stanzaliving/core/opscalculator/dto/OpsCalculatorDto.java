/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class OpsCalculatorDto {

	@NotNull(message = "Residence id is mandatory")
	private String residenceId;

	@NotNull(message = "Service mix id is mandatory")
	private String serviceMixId;

	private String uuid;
	private String versionName;
	private LocalDate fromDate;
	private OpsCalculatorDetailDto opsCalculatorDetailDto;

}
