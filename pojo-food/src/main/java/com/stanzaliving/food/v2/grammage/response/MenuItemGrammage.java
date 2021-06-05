package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.dto.KeyValuePairDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 05-Jun-2021
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemGrammage {

	private KeyValuePairDto item;

	private boolean additive;

	private Integer grammage;

}
