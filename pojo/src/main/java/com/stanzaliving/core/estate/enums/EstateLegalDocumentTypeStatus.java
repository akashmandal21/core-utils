/**
 * 
 */
package com.stanzaliving.core.estate.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
public enum EstateLegalDocumentTypeStatus {

	LOI_APPROVAL_REQUEST_RAISED("LOI Approval Request Raised", "#9403BC" , "#EFC5FA"),
	LOI_REQUEST_APPROVED("LOI Request Approved","#9403BC" , "#EFC5FA"),
	LOI_REQUEST_DECLINE("LOI Request Decline","#9403BC" , "#EFC5FA"),
	ATL_APPROVAL_REQUEST_RAISED("ATL Approval Request Raised","#9403BC" , "#EFC5FA"),
	ATL_REQUEST_APPROVED("ATL Request Approved","#9403BC" , "#EFC5FA"),
	ATL_REQUEST_DECLINE("ATL Request Declined","#9403BC" , "#EFC5FA");
	
	private String description;
	private String textColor;
	private String bgColor;
	
	EstateLegalDocumentTypeStatus(String description, String texColor, String bgColor) {
		this.description = description;
		this.textColor = texColor;
		this.bgColor = bgColor;
	}
	
	
	public static Map<String, String> getEstateLegalDocumentStatus() {
		
		Map<String, String> statusMap = new HashMap<>();
		
		for(EstateLegalDocumentTypeStatus status : EstateLegalDocumentTypeStatus.values()) {
			statusMap.put(status.toString(), status.getDescription());
		}
		
		return statusMap;
	}
}
