package com.stanzaliving.core.operations.dto;

import com.stanzaliving.core.operations.enums.Frequency;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FoodCompositionBrandDetailDto {

    private Frequency frequency;
    private int numberOfTimes;
    private String serviceDetailName;
    private String serviceDetailId;
    private String brandName;

}
