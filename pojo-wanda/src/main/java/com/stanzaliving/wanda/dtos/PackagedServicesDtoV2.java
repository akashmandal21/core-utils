package com.stanzaliving.wanda.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PackagedServicesDtoV2 {

	private String serviceId;
	
	private String serviceName;
	
	private String serviceImage;
	
	private String serviceDescription;
	
	private String serviceShortText;
	
	private String serviceDisclaimer;
	
	private String bgColor;
	
	private boolean tappable;
	
}
