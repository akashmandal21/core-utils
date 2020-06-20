package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OtherServices extends BooleanService {
	
	private Cafetaria cafetaria;
	private BooleanService room_dth;
	private BooleanService vending_machine;
	private BooleanService coffee_machine;
}
