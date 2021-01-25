/**
 * 
 */
package com.stanzaliving.designservice.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
public enum DesignStatus {

	UNDER_DRAFT("Under Draft","#00B5CC"),
	SENT_FOR_INITIAL_BED_COUNT("Sent For Initial Bed Count","#E87E04"),
	SENT_TO_DESIGN_HEAD("Sent To Design Head", "#00B5CC"),
	INTIAL_BED_COUNT_APPROVED("Initial Bed Count Approved", "#019875"),
	SENT_BACK_BY_DESIGN_COORDINATOR("Sent Back By Design Coordinator", "#BFBFBF"),
	SENT_BACK_BY_DESIGN_HEAD("Sent Back By Design Head", "#8D6F6F");
	
	private String statusDescription;
	private String colorCode;
	private static Map<DesignStatus, String> designStatusAndDescription = new HashMap<>();
	
	private DesignStatus(String statusDescription, String colorCode) {
		this.statusDescription = statusDescription;
		this.colorCode = colorCode;
	}
	
	public static Map<DesignStatus, String> getDesignStatusAndDescription() {
		
		for(DesignStatus record : DesignStatus.values()) {
			
			if(record != DesignStatus.UNDER_DRAFT)
				designStatusAndDescription.put(record, record.getStatusDescription());
		}
		
		return designStatusAndDescription;
	}
}
