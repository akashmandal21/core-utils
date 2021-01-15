package com.stanzaliving.core.food.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com'
 *
 * @version 1.0
 *
 * @since 15-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DishMasterRatingResponseDto extends DishMasterSearchResponseDto {

	private static final long serialVersionUID = -77978649022785L;

	private Integer totalRatingCount;

	private Integer totalRating;

	private Float avgRating;

	private Float delightedPercent;

	private Float disgustedPercent;

	private Float fpsPercent;

	private Double cost;

	private List<ResidencePerformanceDto> residencePerformance;

}
