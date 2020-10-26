package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 28-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMasterSearchResponseDto {
	private String vasMasterId;

	private String name;

	private EnumListing foodType;

	private String imageUrl;

	private ListingDto category;

	private List<String> accompaniment;

	private EnumListing vasType;

	private Boolean quantifiable;

	private Double proposedPrice;

	private boolean status;

	private boolean dataComplete;

}
