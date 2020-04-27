package com.stanzaliving.designservice.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum PhoenixDesignStatus {

	UNDER_DRAFT("Under Draft","#00B5CC"),
	SENT_FINAL_BED_COUNT_TO_DESIGN_HEAD("Sent Final Bed Count To Design Head", "#00B5CC"),
	FINAL_BED_COUNT_APPROVED("Final Bed Count Approved", "#019875"),
	SENT_BACK_FINAL_BED_COUNT_BY_DESIGN_COORDINATOR("Sent Back Final Bed Count By Design Coordinator", "#BFBFBF"),
	SENT_BACK_FINAL_BED_COUNT_BY_DESIGN_HEAD("Sent Back Final Bed Count By Design Head", "#BFBFBF");

	private String statusDescription;
	private String colorCode;
	private static Map<PhoenixDesignStatus, String> designStatusAndDescription = new HashMap<>();

	private PhoenixDesignStatus(String statusDescription, String colorCode) {
		this.statusDescription = statusDescription;
		this.colorCode = colorCode;
	}
	
	public static Map<PhoenixDesignStatus, String> getDesignStatusAndDescription() {
		
		for(PhoenixDesignStatus record : PhoenixDesignStatus.values()) {
			
			if(record != PhoenixDesignStatus.UNDER_DRAFT)
				designStatusAndDescription.put(record, record.getStatusDescription());
		}
		
		return designStatusAndDescription;
	}
}
