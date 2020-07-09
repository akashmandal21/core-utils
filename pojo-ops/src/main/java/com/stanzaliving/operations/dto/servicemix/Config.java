package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Config {
	private FoodService foodService;
	//private FoodComposition foodComposition;
	//private FoodMenu foodMenu;
	private InternetService internet;
	private HouseKeeping houseKeeping;
	private Security security;
	private Laundry laundry;
	private Electricity electricity;
	private GymService gym;
	private TransportService transport;
	private OtherServices other;
}
