package com.stanzaliving.core.operations.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FoodCanteenDto {

    private String serviceName;
    private boolean commonDetails;
    private String serviceDetailId;
    private List<FoodCanteenBrandDetailDto> brandDetailsDtoList;
}
