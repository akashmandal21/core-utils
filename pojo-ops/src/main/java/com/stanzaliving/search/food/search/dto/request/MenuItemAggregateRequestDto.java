package com.stanzaliving.search.food.search.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 26-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemAggregateRequestDto {

	private String micromarketId;

	private Collection<String> itemIds;

	@NotNull(message = "fromDate is mandatory")
	private LocalDate fromDate;

	@NotNull(message = "toDate is mandatory")
	private LocalDate toDate;
}
