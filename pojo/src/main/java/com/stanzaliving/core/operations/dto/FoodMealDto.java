package com.stanzaliving.core.operations.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FoodMealDto {

    private String serviceName;
    private Date startTime;
    private Date endTime;
    private String serviceDetailId;
    private List<FoodMealBrandDetailsDto> brandDetailsDtos;
}
