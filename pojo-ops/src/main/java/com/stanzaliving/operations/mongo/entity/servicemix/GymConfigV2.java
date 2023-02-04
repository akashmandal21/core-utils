package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.GymDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class GymConfigV2 {

  @Id
  private String id;
  @Builder.Default
  private String gymPlanId = "Gym_Default_Plan_Id";
  @Builder.Default
  private String gymPlanName = "Default Plan";
  @Builder.Default
  private GymDetails gym = new GymDetails();
  @Builder.Default
  private GymDetails multigym = new GymDetails();
  @Builder.Default
  private GymDetails treadmill = new GymDetails();

  private boolean active;
  @Builder.Default
  private boolean defaultPlan = false;
}
