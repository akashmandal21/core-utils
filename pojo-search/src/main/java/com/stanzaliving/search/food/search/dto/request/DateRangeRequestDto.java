package com.stanzaliving.search.food.search.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 29-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DateRangeRequestDto {

	@NotNull(message = "fromDate is mandatory")
	private LocalDate fromDate;

	@NotNull(message = "toDate is mandatory")
	private LocalDate toDate;
}
