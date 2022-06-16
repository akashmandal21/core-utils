package com.stanzaliving.core.opscalculator.v2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class EquipmentRateMasterDto {
  private String equipmentName;
  private String equipmentCapicity;
  private String equipmentAmcRatePerYear;
   
}
