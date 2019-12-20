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

	DRAFT_IN_PROGRESS("Draft In Progress"),
	SHORTLISTED("Shortlisted"),
	REJECTED("Rejected"),
	APPROVED_BY_CITY_HEAD("Shortlisted By City Head"),
	REJECTED_BY_CITY_HEAD("Rejected By City Head"),
	SENT_FOR_APPROVAL_TO_CITY_HEAD("Sent for approval to City Head"),
	DOCUMENTS_NEEDED("Documents Needed"),
	INFORMATION_NEEDED("Information Needed"),
	SENT_BACK("Sent Back"),
	SENT_BACK_BY_CITY_HEAD("Sent Back By City Head"),
	SENT_FOR_APPROVAL("Sent for Approval");

	public static List<EstateStatus> NON_MODIFIABLE_ESTATE_STATUS;
	
	public static List<EstateStatus> MANAGER_NAME_ESTATE_STATUS;

	private String name;

	private static Map<EstateStatus, String> estateStatusMap = new HashMap<>();

	static {
		estateStatusMap.put(DRAFT_IN_PROGRESS, EstateStatus.DRAFT_IN_PROGRESS.getName());
		estateStatusMap.put(SHORTLISTED, EstateStatus.SHORTLISTED.getName());
		estateStatusMap.put(REJECTED, EstateStatus.REJECTED.getName());
		estateStatusMap.put(DOCUMENTS_NEEDED, EstateStatus.DOCUMENTS_NEEDED.getName());
		estateStatusMap.put(INFORMATION_NEEDED, EstateStatus.INFORMATION_NEEDED.getName());
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