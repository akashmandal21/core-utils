package com.stanzaliving.operations.dto.servicemix;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OtherServices extends BooleanService {
	
	private MultiTimeSlotService cafetaria;
	
	@JsonProperty("room_dth")
	private BooleanService roomDth;
	
	@JsonProperty("vending_machine")
	private BooleanService vendingMachine;
	
	@JsonProperty("coffee_machine")
	private BooleanService coffeeMachine;
	
	private Supplies supplies;
}
