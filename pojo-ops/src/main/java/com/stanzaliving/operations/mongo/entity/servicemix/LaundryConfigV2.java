package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.WashingService;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(callSuper = true)
@SuperBuilder
public class LaundryConfigV2 {
  @Id
  private String id;
  @Builder.Default
  private String laundryPlanId = "Laundry_Default_Plan_Id";
  @Builder.Default
  private String laundryPlanName = "Default Plan";
  @Builder.Default
  private WashingService washIron = new WashingService();
  @Builder.Default
  private WashingService washFold = new WashingService();
  private boolean active;
  @Builder.Default
  private boolean defaultPlan = false;
}
