package com.stanzaliving.core.estate.dto;

import lombok.Data;

@Data
public class BrokerDetailsDto {
	private Boolean brokerInvolved;
	private Boolean empanelledBroker;
	private String brokerName;
	
	private String brokerNumber;
	
	private String brokerEmail;	
}