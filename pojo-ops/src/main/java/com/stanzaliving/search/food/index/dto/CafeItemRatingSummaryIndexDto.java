package com.stanzaliving.search.food.index.dto;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeItemRatingSummaryIndexDto extends AbstractSearchIndexDto {

	private String cafeId;

	private LocalDate orderDate;

	private String itemId;

	private Integer totalRating;

	private Integer totalRatingCount;

	private Float avgRating;

}
