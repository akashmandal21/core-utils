package com.stanzaliving.search.food.index.dto.vasmaster;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 22-Jan-2021
 */


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMasterDishIndexDto {

	private String dishId;

	private Boolean accompaniment;

	private Double grammageAmount;

	private Double grammageQuantity;
}
