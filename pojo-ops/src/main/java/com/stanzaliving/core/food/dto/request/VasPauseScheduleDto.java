package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 06-Oct-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasPauseScheduleDto {
	@NotBlank(message = "Vendor is mandatory")
	private String vendorId;

	@NotNull(message = "Pause From Date is mandatory")
	private LocalDate pauseFrom;

	private LocalDate pauseTo;
}
