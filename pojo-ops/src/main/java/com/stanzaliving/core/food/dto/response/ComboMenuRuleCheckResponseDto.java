/**
 * 
 */
package com.stanzaliving.core.food.dto.response;

import java.util.List;

import com.stanzaliving.core.food.dto.RegionBasePreferenceDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 14 Jul, 2020
 *
 **/
@Getter
@Setter
@Builder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class ComboMenuRuleCheckResponseDto {

	private String missingTagName;

	private List<RegionBasePreferenceDto> combosMissingMandatoryItems;
}