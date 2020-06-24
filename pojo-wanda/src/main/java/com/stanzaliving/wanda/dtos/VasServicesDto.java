package com.stanzaliving.wanda.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class VasServicesDto{

	private Integer serviceId;
	
	private double serviceCost;
	
	private String duration;

	private String serviceName;
	
	private String serviceImage;
	
	private String serviceDescription;
	
	private String serviceDisclaimer;
}
