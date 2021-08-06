/**
 * 
 */
package com.stanzaliving.food.v2.common.dto;

import java.io.Serializable;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author manish.pareek
 *
 * @date 3rd Aug, 2021
 *
 **/
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemFeedbackSuggestionDto extends AbstractDto implements Serializable {
	private static final long serialVersionUID = 6803893629227352229L;
	private String item;
	private String suggestion;
	private String suggestionId;
}