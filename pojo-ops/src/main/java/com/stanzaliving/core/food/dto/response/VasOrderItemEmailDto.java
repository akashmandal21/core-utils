package com.stanzaliving.core.food.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 05-Nov-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
public class VasOrderItemEmailDto {

	private String itemName;

	private String itemType;

	private Integer qty;

	private Double price;
}
