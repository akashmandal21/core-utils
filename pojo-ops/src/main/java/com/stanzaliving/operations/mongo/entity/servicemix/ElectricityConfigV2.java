package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.ElectricityAddonService;
import com.stanzaliving.operations.dto.servicemix.ElectricityService;
import com.stanzaliving.operations.dto.servicemix.PowerBackup;
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
public class ElectricityConfigV2 {
  @Id
  private String id;
  @Builder.Default
  private String electricityPlanId = "Electricity_Default_Plan_Id";
  @Builder.Default
  private String electricityPlanName = "Default Plan";
  @Builder.Default
  private ElectricityService room = new ElectricityService();
  @Builder.Default
  private ElectricityService commonArea = new ElectricityService();
  @Builder.Default
  private ElectricityAddonService geyser = new ElectricityAddonService();
  @Builder.Default
  private ElectricityAddonService commonGeyser = new ElectricityAddonService();
  @Builder.Default
  private ElectricityAddonService ac = new ElectricityAddonService();
  @Builder.Default
  private PowerBackup powerBackup = new PowerBackup();
  private boolean active;
  @Builder.Default
  private boolean defaultPlan = false;
}
