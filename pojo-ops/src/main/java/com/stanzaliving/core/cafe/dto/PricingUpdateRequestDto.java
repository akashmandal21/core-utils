package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
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

    @NotBlank(message = "Cafe selection is mandatory")
    private String cafeId;

    @NotEmpty(message = "Items prices selection is mandatory")
    private List<@Valid CafeItemPricingUpdateRequestDto> cafeItemsPricingList;

}