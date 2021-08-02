package com.stanzaliving.wanda.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class VasServicesDto{

	private String serviceId;
	
	private double serviceCost;
	
	private String serviceCostStr;
	
	private String duration;

	private String serviceName;
	
	private String serviceImage;
	
	private String serviceDescription;
	
	private String serviceShortText;
	
	private String serviceDisclaimer;
	
	private String bgColor;
	
	private Double price;
	@Builder.Default
	private Double cgst = 0.0;
	@Builder.Default
	private Double sgst = 0.0;
	@Builder.Default
	private Double igst = 0.0;
}
