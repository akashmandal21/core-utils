/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemRecipeCsvRequestDto {

	private String siteId;

	private String vendorId;

	@Builder.Default
	private LocalDate menuDate = LocalDate.now();

}
