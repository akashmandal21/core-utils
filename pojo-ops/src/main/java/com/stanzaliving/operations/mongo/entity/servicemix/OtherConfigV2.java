package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.AcquiredBooleanService;
import com.stanzaliving.operations.dto.servicemix.MultiTimeSlotService;
import com.stanzaliving.operations.dto.servicemix.Supplies;
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
public class OtherConfigV2 {
  @Id
  private String id;
  @Builder.Default
  private String othersPlanId = "Others_Default_Plan_Id";

  @Builder.Default
  private String othersPlanName = "Default Plan";

  @Builder.Default
  private MultiTimeSlotService cafetaria = new MultiTimeSlotService();

  @Builder.Default
  private AcquiredBooleanService roomDth = new AcquiredBooleanService();

  @Builder.Default
  private AcquiredBooleanService vendingMachine = new AcquiredBooleanService();

  @Builder.Default
  private AcquiredBooleanService coffeeMachine = new AcquiredBooleanService();

  @Builder.Default
  private Supplies supplies = new Supplies();

  @Builder.Default
  private AcquiredBooleanService washingMachine = new AcquiredBooleanService();

  @Builder.Default
  private AcquiredBooleanService microwave = new AcquiredBooleanService();

  @Builder.Default
  private AcquiredBooleanService singleDoorFridge = new AcquiredBooleanService();

  @Builder.Default
  private AcquiredBooleanService doubleDoorFridge = new AcquiredBooleanService();

  @Builder.Default
  private AcquiredBooleanService waterDispenser = new AcquiredBooleanService();

  @Builder.Default
  private AcquiredBooleanService dryer = new AcquiredBooleanService();

  @Builder.Default
  private AcquiredBooleanService ro = new AcquiredBooleanService();

  @Builder.Default
  private AcquiredBooleanService tv = new AcquiredBooleanService();

  private boolean active;

  @Builder.Default
  private boolean defaultPlan = false;
}
