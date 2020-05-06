package com.stanzaliving.designservice.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum PhoenixDesignStatus {

	NOT_STARTED("Not Available","#e5e3e3"),
	IN_DRAFT("In draft","#e5e3e3"),
	SUBMITTED("Submitted","#e5e3e3"),
	TRANSFORMATIONS("Sent For Approval","#e5e3e3"),
	APPROVED_BY_TRANSFORMATIONS("Approved By Transformations","#e5e3e3"),
	SENT_BACK_BY_TRANSFORMATIONS("Sent Back By Transformations","#e5e3e3"),;

	
	/*
	 * NOT_STARTED("Not Started","#e5e3e3"), IN_DRAFT("In draft","#e5e3e3"),
	 * SUBMITTED("Submitted","#e5e3e3"), ZONAL_HEAD("Zonal Head","#e5e3e3"),
	 * SENT_BACK_BY_ZONAL_HEAD("Sent back by zonal head","#e5e3e3"),
	 * DESIGN_HEAD("Design head","#e5e3e3"),
	 * SENT_BACK_BY_DESIGN_HEAD("Sent back by design head","#e5e3e3"),
	 * TRANSFORMATIONS("Sent For Approval","#e5e3e3"),
	 * APPROVED_BY_TRANSFORMATIONS("Approved By Transformations","#e5e3e3"),
	 * SENT_BACK_BY_TRANSFORMATIONS("Sent back by tranformation","#e5e3e3"),
	 * LEADERSHIP("Leadership","#e5e3e3"),
	 * SENT_BACK_BY_LEADERSHIP("sent back by leadership","#e5e3e3");s
	 */

	
	private String statusDescription;
	private String colorCode;
	private static Map<PhoenixDesignStatus, String> designStatusAndDescription = new HashMap<>();

	private PhoenixDesignStatus(String statusDescription, String colorCode) {
		this.statusDescription = statusDescription;
		this.colorCode = colorCode;
	}
	
	public static Map<PhoenixDesignStatus, String> getDesignStatusAndDescription() {
		
		for(PhoenixDesignStatus record : PhoenixDesignStatus.values()) {
			
			if(record != PhoenixDesignStatus.IN_DRAFT)
				designStatusAndDescription.put(record, record.getStatusDescription());
		}
		
		return designStatusAndDescription;
	}
}
