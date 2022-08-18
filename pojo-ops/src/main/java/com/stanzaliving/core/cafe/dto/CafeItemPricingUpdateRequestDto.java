package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
public class CafeItemPricingUpdateRequestDto {

    @NotBlank(message = "Item selection is mandatory")
    private String itemId;

    @DecimalMin( value = "0.0", inclusive = false, message = "price can not be less than 0")
    @NotNull(message = "Price selection is mandatory for every item")
    private Double masterPriceInclGst;

    private List<CogsPriceDto> cogs;

    private boolean itemEnableStatus;

    private boolean residencePriceEnabled;

    @NotEmpty(message = "residenceItemPricingList cannot be empty")
    private List<@Valid ResidenceItemPricingUpdateRequestDto> residenceItemPricingList;

}