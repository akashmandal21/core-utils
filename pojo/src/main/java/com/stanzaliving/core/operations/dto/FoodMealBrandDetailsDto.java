package com.stanzaliving.core.operations.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FoodMealBrandDetailsDto {

    private String serviceDetailId;
    private String brandName;
    private String serviceDetailName;
    private boolean available;
    private boolean availableAsVas;

}
