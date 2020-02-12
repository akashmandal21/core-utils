/**
 * 
 */
package com.stanzaliving.core.estate.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 18-Nov-2019
 *
 **/
@Getter
public enum EstateStatus {

	//BD Level Status
	DRAFT_IN_PROGRESS("Under Draft"),
	
	//Level 1 Status
	SENT_FOR_APPROVAL_TO_CITY_HEAD("L1 Sent to RM"),
	APPROVED_BY_CITY_HEAD("Shortlisted By RM"),
	SENT_BACK_BY_CITY_HEAD("L1 Sent Back By RM"),
	REJECTED("Rejected"),
	
	//Level 2 Status
	SENT_FOR_APPROVAL("L2 Sent To NH"),
	SENT_BACK("L2 Sent Back By NH"),
	APPROVED_BY_NATIONAL_HEAD("L2 Approved By NH"),
	SENT_BACK_BY_TRANSFORMATION("Sent Back By Transformations"),
	APPROVED_BY_TRANSFORMATION("Approved By Transformations"),
	SHORTLISTED("Shortlisted"),
	
	//Level 3 Status
	SENT_TO_CENTRAL_BD_TEAM("Sent To Central BD Team"),
	SENT_BACK_BY_CENTRAL_BD_TEAM("Sent Back By Central BD Team"),
	SENT_TO_LEGAL("Sent to Legal"),
	SENT_BACK_BY_LEGAL("Sent Back By Legal"),
	
	//ATL Status
	SIGNED_ATL_UPLOADED("Sent for Property Naming"),
	ATL_UPLOAD_PENDING("ATL Upload Pending"),

	//Leadership Status
	SENT_BACK_BY_LEADERSHIP("Sent Back By Leadership"),
	APPROVED_BY_LEADERSHIP("Property Naming Done"),


	SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD("L1 Sent to NH"),
	SENT_FOR_L1_APPROVAL_TO_LEADERSHIP("L1 Sent to Leadership"),
	APPROVED_L1_BY_LEADERSHIP("L1 Approval by Leadership"),
	SENT_BACK_L1_BY_NATIONAL_HEAD("L1 Sent Back by NH"),
	SENT_BACK_L1_BY_LEADERSHIP("L1 Sent Back by Leadership"),

	//Sandeep's approval & sent back
	SENT_FOR_SANDEEP_APPROVAL("Sent for Sandeep's approval"),
	SENT_BACK_BY_SANDEEP("Sent back by Sandeep");

	public static List<EstateStatus> NON_MODIFIABLE_ESTATE_STATUS;
	
	private String name;

	private static Map<EstateStatus, String> estateStatusMap = new HashMap<>();

	static {
		estateStatusMap.put(DRAFT_IN_PROGRESS, EstateStatus.DRAFT_IN_PROGRESS.getName());
		estateStatusMap.put(SHORTLISTED, EstateStatus.SHORTLISTED.getName());
		estateStatusMap.put(REJECTED, EstateStatus.REJECTED.getName());
		estateStatusMap.put(SENT_BACK, EstateStatus.SENT_BACK.getName());
		estateStatusMap.put(SENT_FOR_APPROVAL, EstateStatus.SENT_FOR_APPROVAL.getName());
		estateStatusMap.put(SENT_BACK_BY_CITY_HEAD, EstateStatus.SENT_BACK_BY_CITY_HEAD.getName());
		
		
		NON_MODIFIABLE_ESTATE_STATUS = Arrays.asList(SENT_FOR_APPROVAL, SHORTLISTED);
	}

	private EstateStatus(String name) {
		this.name = name;
	}

	public static Map<EstateStatus, String> getAll() {
		return estateStatusMap;
	}

}
