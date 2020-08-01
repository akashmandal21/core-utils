package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Config {

	private FoodService foodService = new FoodService();
	private FoodComposition foodComposition = new FoodComposition();
	private FoodMenu foodMenu = new FoodMenu();
	private InternetService internet = new InternetService();
	private HouseKeeping houseKeeping = new HouseKeeping();
	private Security security = new Security();
	private Laundry laundry = new Laundry();
	private Electricity electricity = new Electricity();
	private GymService gym = new GymService();
	private TransportService transport = new TransportService();
	private OtherServices other = new OtherServices();
}