package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.WashLimit;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class WashingService extends BooleanService {
	private Integer cloths;
	private Double weight;
	private WashLimit unitType;
	private int repetation;
}
