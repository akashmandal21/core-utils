/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.vas.response;

import java.util.Date;
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
public class VasOrderAndCategoryItemUIResponseDto {

	private VasOrderUpdateUIResponseDto order;
	private List<VasCategoryItemUIResponseDto> category;

	@Builder.Default
	private Boolean hasNonVeg = Boolean.FALSE;

	private Date windowCloseTime;

}
