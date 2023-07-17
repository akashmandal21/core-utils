package com.stanzaliving.core.backendlocator.client.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FutureRoomPricingDTO {
	
	private int occupancy;
	
	private int convertedPrice;
	
	private String updateType;
	
	private int basePrice;
	
	private double mandatoryServicesPrice;
	
	private int attributesPrice;
	
	private int bufferPrice;
	
	private int roomPrice;
	
	private double pricingPerBed;
	
	private double cgst;
	
	private double sgst;
	
	private double igst;

	private double foodServicePrice;

	private double foodServiceCgst;

	private double foodServiceSgst;

	private double foodServiceIgst;
	
	private Date startDate;
	
	private Date endDate;
	
	private boolean isIsConverted;
	
	private String occupancyName;
}
