package com.stanzaliving.operations.mongo.entity.servicemix;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;


@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class FoodConfigV2 {
  @Id
  private String id;
  private FoodMealConfigV2 foodMealConfig;
  private FoodMenuConfigV2 foodMenuConfig;
  private FoodCompositionConfigV2 foodCompositionConfig;
  private boolean active;

}
