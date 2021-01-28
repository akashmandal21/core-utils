package com.stanzaliving.search.food.search.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 27-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuMicromarketAggregateRequestDto {
	private String micromarketId;

	@NotNull(message = "fromDate is mandatory")
	private LocalDate fromDate;

	@NotNull(message = "toDate is mandatory")
	private LocalDate toDate;
}
