package com.stanzaliving.productmix.dto.productmix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductMixDto {

    private ProductMixDetails productMixDetails;

    private RoomAttributeDto roomAttribute;

    private PropertyAttributeDto propertyAttribute;
}
