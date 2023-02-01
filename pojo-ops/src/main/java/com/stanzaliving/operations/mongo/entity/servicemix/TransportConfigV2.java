package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.enums.TransportAvailabilityMode;
import com.stanzaliving.operations.enums.TransportSchedule;
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
public class TransportConfigV2 {
  @Id
  private String id;
  @Builder.Default
  private String transportPlanId = "Transport_Default_Plan_Id";
  @Builder.Default
  private String transportPlanName = "Default Plan";
  private TransportAvailabilityMode availability;
  private TransportSchedule schedule;
  private Double freeKm;
  private boolean active;
  @Builder.Default
  private boolean defaultPlan = false;
}
