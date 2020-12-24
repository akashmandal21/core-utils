package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class CogsPriceDto {

    @NotBlank(message = "Kitchen Selection is mandatory")
    private String kitchenId;

    private String kitchenName;

    private Double costPrice;

    private boolean primaryKitchen;

}
