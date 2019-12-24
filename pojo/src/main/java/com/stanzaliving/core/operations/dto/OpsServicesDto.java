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
public class OpsServicesDto extends OpsServiceDataDto {

    private List<ServiceMetadata> serviceMetadata;

    private FoodMealServiceDto foodMealServiceDto;

    private FoodCompositionServiceDto foodCompositionServiceDto;

    private FoodCanteenServiceDto foodCanteenServiceDto;

    private InternetServiceDto internetServiceDto;

    private HouseKeepingServiceDto houseKeepingServiceDto;

    private LaundryServiceDto laundryServiceDto;

    private ElectricityServiceDto electricityServiceDto;

    private TransportServiceDto transportServiceDto;

    private GymServiceDto gymServiceDto;

    private SecurityServiceDto securityServiceDto;

}
