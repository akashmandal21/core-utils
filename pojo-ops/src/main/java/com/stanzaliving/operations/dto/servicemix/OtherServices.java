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
	private AcquiredBooleanService roomDth = new AcquiredBooleanService();
	
	@JsonProperty("vending_machine")
	private AcquiredBooleanService vendingMachine = new AcquiredBooleanService();
	
	@JsonProperty("coffee_machine")
	private AcquiredBooleanService coffeeMachine = new AcquiredBooleanService();
	
	private Supplies supplies = new Supplies();
	
	private AcquiredBooleanService washingMachine = new AcquiredBooleanService();
	
	private AcquiredBooleanService microwave = new AcquiredBooleanService();
	
	private AcquiredBooleanService singleDoorFridge = new AcquiredBooleanService();
	
	private AcquiredBooleanService doubleDoorFridge = new AcquiredBooleanService();
	
	private AcquiredBooleanService waterDispenser = new AcquiredBooleanService();
	
	private AcquiredBooleanService dryer = new AcquiredBooleanService();
	
}
