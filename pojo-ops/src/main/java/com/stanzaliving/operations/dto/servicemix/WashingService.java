package com.stanzaliving.operations.dto.servicemix;

import java.io.Serializable;

import com.stanzaliving.operations.enums.WashLimit;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class WashingService extends BooleanService implements Serializable {
  private static final long serialVersionUID = 4712134052620448631L;
  private Integer cloths;
  private Double weight;
  private WashLimit unitType;
  private int repetation;
}
