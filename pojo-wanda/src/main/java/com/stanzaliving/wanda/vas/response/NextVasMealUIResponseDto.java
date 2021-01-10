/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.vas.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NextVasMealUIResponseDto {

	private long nextMealItemsCount;
	private List<ItemCostUIResponseDto> items;

}
