package com.stanzaliving.food.v2.category.dto;


import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategorySearchVendorAndResidenceWiseDto {
    private List<String> residenceIds;
    private List<String> vendorIds;
}
