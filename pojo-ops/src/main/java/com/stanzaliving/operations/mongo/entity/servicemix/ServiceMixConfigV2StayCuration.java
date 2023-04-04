package com.stanzaliving.operations.mongo.entity.servicemix;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ServiceMixConfigV2StayCuration {

    private FoodConfigV2StayCuration foodConfig;
    private InternetConfigV2StayCuration internetConfig;
    private GymConfigV2StayCuration gymConfig;
    private LaundryConfigV2StayCuration laundryConfig;
    private HouseKeepingConfigV2StayCuration houseKeepingConfig;
    private SecurityConfigV2StayCuration securityConfig;
    private ElectricityConfigV2StayCuration electricityConfig;
    private TransportConfigV2StayCuration transportServiceConfig;
    private OtherConfigV2StayCuration otherServicesConfig;
}
