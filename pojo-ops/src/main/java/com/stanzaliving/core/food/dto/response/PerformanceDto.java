package com.stanzaliving.core.food.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 15-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PerformanceDto implements Serializable {
	private static final long serialVersionUID = -8975757644L;

	private Integer totalRating;

	private Integer totalRatingCount;

	private Float avgRating;

	private Float delightedPercent;

	private Float disgustedPercent;

	private Float fpsPercent;

}
