package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author ashutosh.chandra "ashutoshchandra.retainer@stanzaliving.com"
 * @version 1.0
 * @since 29-Oct-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PricingUpdateRequestDto {

    private String cafeId;

    private List<CafeItemPricingUpdateRequestDto> cafeItemsPricingList;

}