package com.stanzaliving.core.opscalculator.V2.dto;

import java.io.Serializable;

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
public class EquipmentRateMasterDto implements Serializable{
  private String equipmentName;
  private String equipmentCapicity;
  private String equipmentAmcRatePerYear;
   
}
