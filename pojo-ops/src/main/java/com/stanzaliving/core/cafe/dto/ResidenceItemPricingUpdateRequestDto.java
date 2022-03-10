package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class ResidenceItemPricingUpdateRequestDto {

    @NotBlank(message = "Residence Selection is mandatory")
    private String residenceid;

    private String residenceName;

    @DecimalMin(value = "0.1", inclusive = false, message = "Price should be greater than 0")
    @NotNull(message = "Residence wise price is mandatory")
    private Double residencePriceInclGst;

    private Double residencePriceExclGst;

    private Double margin;

}
