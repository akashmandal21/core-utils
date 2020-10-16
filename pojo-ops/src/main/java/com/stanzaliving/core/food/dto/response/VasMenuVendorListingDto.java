package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 13-Oct-2020
 *
 * @version 1.0
 */


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMenuVendorListingDto {

	private String kitchenId;

	private String kitchenName;

	private boolean stanzaKitchen;

	private ListingDto city;

	private Integer residenceCount;

	private Integer vasItemsCount;

	private boolean pricing;

	private Integer marginGreaterThanTwenty;

	private Integer marginGreaterThanFifty;

	private Integer marginGraterThanHundred;

	private boolean dataComplete;
}
