package com.stanzaliving.operations.dto.servicemix;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
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
public class ServiceMixSerializableV2Config {

  @Builder.Default
  private List<FoodService> foodService = new ArrayList<>();
  @Builder.Default
  private List<FoodComposition> foodComposition = new ArrayList<>();
  @Builder.Default
  private List<FoodMenu> foodMenu = new ArrayList<>();
  @Builder.Default
  private List<InternetService> internet = new ArrayList<>();
  @Builder.Default
  private List<HouseKeeping> houseKeeping = new ArrayList<>();
  @Builder.Default
  private List<Security> security = new ArrayList<>();
  @Builder.Default
  private List<Laundry> laundry = new ArrayList<>();
  @Builder.Default
  private List<Electricity> electricity = new ArrayList<>();
  @Builder.Default
  private List<GymService> gym = new ArrayList<>();
  @Builder.Default
  private List<TransportService> transport = new ArrayList<>();
  @Builder.Default
  private List<OtherServices> other = new ArrayList<>();
}