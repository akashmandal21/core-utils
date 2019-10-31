package com.stanzaliving.core.estate.dto;

import lombok.Data;

@Data
public class BrokerDetailsDto {
	private boolean brokerInvolved;
	
	private boolean empanelledBroker;
	
	private String brokerName;
	
	private String brokerMobileNumber;
	
	private String brokerEmail;
	
	private int periodInDays;
}