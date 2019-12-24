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
public class FoodCompositionDto {

    private String compositionName;
    private String serviceDetailId;
    private List<FoodCompositionBrandDetailDto> foodCompositionBrandDetailDtos;


}
