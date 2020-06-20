package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.WashLimit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WashingService extends BooleanService {
	private Integer cloths;
	private Double weight;
	private WashLimit unitType;
	private int repetation;
}
