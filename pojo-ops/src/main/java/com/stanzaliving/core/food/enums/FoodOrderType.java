package com.stanzaliving.core.food.enums;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 10-Sep-2020
 *
 * @version 1.0
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum FoodOrderType {
	PACKAGED("Packaged Order"),
	KITCHEN("Kitchen Order");

	private String orderTypeName;
}
