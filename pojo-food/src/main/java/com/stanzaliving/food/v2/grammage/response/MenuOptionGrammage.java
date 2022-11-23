package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.dto.KeyValuePairDto;
import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.food.v2.common.constant.ThaliType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
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
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuOptionGrammage implements Serializable {

	private KeyValuePairDto thali;

	private EnumListing<ThaliType> thaliType;

	private Integer thaliGrammage;

	private Integer expectedThaliGrammage;

	private List<MenuItemGrammage> menuItemsGrammage;
}
