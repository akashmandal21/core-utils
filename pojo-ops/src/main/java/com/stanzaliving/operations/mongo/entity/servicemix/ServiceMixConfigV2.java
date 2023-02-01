package com.stanzaliving.operations.mongo.entity.servicemix;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;




@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ServiceMixConfigV2 {

  private List<FoodConfigV2> foodConfig;
  private List<GymConfigV2> gymConfig;
  private List<InternetConfigV2> internetConfig;
  private List<LaundryConfigV2> laundryConfig;
  private List<HouseKeepingConfigV2> houseKeepingConfig;
  private List<SecurityConfigV2> securityConfig;
  private List<ElectricityConfigV2> electricityConfig;
  private List<TransportConfigV2> transportServiceConfig;
  private List<OtherConfigV2> otherServicesConfig;
}
