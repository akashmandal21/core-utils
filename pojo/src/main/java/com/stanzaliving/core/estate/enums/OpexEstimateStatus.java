package com.stanzaliving.core.estate.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;

@Getter
public enum OpexEstimateStatus {

	DRAFT_IN_PROGRESS("Draft In Progress"),
	SHORTLISTED("Shortlisted"),
	REJECTED("Rejected"),
	DOCUMENTS_NEEDED("Documents Needed"),
	INFORMATION_NEEDED("Information Needed"),
	SENT_BACK_BY_BDHEAD("Sent Back By BD Head"),
	SENT_FOR_APPROVAL("Sent for Approval"),
	
	AUTO_GENERATED("Auto Generated"),
	APPROVED("Approved"),
	MODIFIED("Modified"),
	MODIFIED_NOT_APPROVED("Modified, not Approved");

	public static List<OpexEstimateStatus> NON_MODIFIABLE_ESTATE_STATUS;

	private String name;

	private static Map<OpexEstimateStatus, String> estateStatusMap = new HashMap<>();
	
	static {
		estateStatusMap.put(DRAFT_IN_PROGRESS, OpexEstimateStatus.DRAFT_IN_PROGRESS.getName());
		estateStatusMap.put(SHORTLISTED, OpexEstimateStatus.SHORTLISTED.getName());
		estateStatusMap.put(REJECTED, OpexEstimateStatus.REJECTED.getName());
		estateStatusMap.put(DOCUMENTS_NEEDED, OpexEstimateStatus.DOCUMENTS_NEEDED.getName());
		estateStatusMap.put(INFORMATION_NEEDED, OpexEstimateStatus.INFORMATION_NEEDED.getName());
		estateStatusMap.put(SENT_BACK_BY_BDHEAD, OpexEstimateStatus.SENT_BACK_BY_BDHEAD.getName());
		estateStatusMap.put(SENT_FOR_APPROVAL, OpexEstimateStatus.SENT_FOR_APPROVAL.getName());
		
		
		estateStatusMap.put(AUTO_GENERATED, OpexEstimateStatus.AUTO_GENERATED.getName());
		estateStatusMap.put(APPROVED, OpexEstimateStatus.APPROVED.getName());
		estateStatusMap.put(MODIFIED, OpexEstimateStatus.MODIFIED.getName());
		estateStatusMap.put(MODIFIED_NOT_APPROVED, OpexEstimateStatus.MODIFIED_NOT_APPROVED.getName());
		
		NON_MODIFIABLE_ESTATE_STATUS = Arrays.asList(SENT_FOR_APPROVAL, SHORTLISTED);
	}
	
	private OpexEstimateStatus(String name) {
		this.name = name;
	}
	
	public static Map<OpexEstimateStatus, String> getAll(){
		return estateStatusMap;
	}
	
	
}