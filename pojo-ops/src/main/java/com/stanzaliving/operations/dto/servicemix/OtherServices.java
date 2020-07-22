package com.stanzaliving.operations.dto.servicemix;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class OtherServices extends BooleanService {
	
	private MultiTimeSlotService cafetaria = new MultiTimeSlotService();
	
	@JsonProperty("room_dth")
	private BooleanService roomDth = new BooleanService();
	
	@JsonProperty("vending_machine")
	private BooleanService vendingMachine = new BooleanService();
	
	@JsonProperty("coffee_machine")
	private BooleanService coffeeMachine = new BooleanService();
	
	private Supplies supplies = new Supplies();
	
	private BooleanService washingMachine = new BooleanService();
	
	private BooleanService microwave = new BooleanService();
	
	private BooleanService singleDoorFridge = new BooleanService();
	
	private BooleanService doubleDoorFridge = new BooleanService();
	
	private BooleanService waterDispenser = new BooleanService();
	
	private BooleanService dryer = new BooleanService();
	
}
