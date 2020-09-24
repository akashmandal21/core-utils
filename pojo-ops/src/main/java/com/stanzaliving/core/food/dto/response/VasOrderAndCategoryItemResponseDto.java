package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.enums.VasOrderStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 18-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasOrderAndCategoryItemResponseDto {

	private VasOrderUpdateResponseDto order;

	private List<VasCategoryItemResponseDto> category;
}
