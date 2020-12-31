package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

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

    private Double residencePriceInclGst;

    private Double residencePriceExclGst;

    private Double margin;

}
