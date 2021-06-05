package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.dto.KeyValuePairDto;
import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.food.v2.common.constant.ThaliType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

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
public class MenuOptionGrammage {

	private KeyValuePairDto thali;

	private EnumListing<ThaliType> thaliType;

	private Integer thaliGrammage;

	private List<MenuItemGrammage> menuItemsGrammage;
}
