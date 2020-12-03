package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
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
public class CafeItemPricingResponseDto {

    private String cafeId;

    private String cafeName;

    private List<BaseKitchenDto> kitchens = new ArrayList<>();

    private long enabledItemCount;

    private List<CafeItemPricingUpdateResponseDto> cafeItemsPricingList = new ArrayList<>();
    ;
}
