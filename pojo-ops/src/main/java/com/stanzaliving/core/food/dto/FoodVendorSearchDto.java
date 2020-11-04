package com.stanzaliving.core.food.dto;


import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Collection;

/**
 * @author piyush srivastava
 *
 * @date 12-May-2020
 *
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodVendorSearchDto {
	private PaginationRequest pagination;

	private String name;

	private String cityId;

	private String contactName;

	private String contactNumber;

	private String contactEmail;

	private Collection<String> uuids;
	
	private Boolean stanzaKitchen;

}
