package com.stanzaliving.core.estate.enums;

import java.util.Map;

import lombok.Getter;

@Getter
public enum EstateStatus {

	DRAFT_IN_PROGRESS("Draft In Progress"),
	SHORTLISTED("Shortlisted"),
	REJECTED("Rejected"),
	DOCUMENTS_NEEDED("Documents Needed"),
	INFORMATION_NEEDED("Information Needed"),
	SENT_BACK_BY_BDHEAD("Sent Back By BD Head");

	private String name;

	private static Map<EstateStatus, String> estateStatusMap;
	
	static {
		estateStatusMap.put(DRAFT_IN_PROGRESS, EstateStatus.DRAFT_IN_PROGRESS.toString());
		estateStatusMap.put(SHORTLISTED, EstateStatus.SHORTLISTED.toString());
		estateStatusMap.put(REJECTED, EstateStatus.REJECTED.toString());
		estateStatusMap.put(DOCUMENTS_NEEDED, EstateStatus.DOCUMENTS_NEEDED.toString());
		estateStatusMap.put(INFORMATION_NEEDED, EstateStatus.INFORMATION_NEEDED.toString());
		estateStatusMap.put(SENT_BACK_BY_BDHEAD, EstateStatus.SENT_BACK_BY_BDHEAD.toString());
	}
	
	private EstateStatus(String name) {
		this.name = name;
	}
	
	public static Map<EstateStatus, String> getAll(){
		return estateStatusMap;
	}
	
	
}