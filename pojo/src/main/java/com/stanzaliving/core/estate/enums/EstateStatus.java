/**
 * 
 */
package com.stanzaliving.core.estate.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
	SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES("L1+DF Sent to RM"),
	APPROVED_BY_CITY_HEAD("Shortlisted By RM"),
	SENT_BACK_BY_CITY_HEAD("L1 Sent Back By RM"),
	SENT_BACK_FROM_INITIAL_BED_COUNT("Sent Back From Initial Bed Count"),
	PENDING_INITIAL_BED_COUNT("Pending Initial Bed Count"),
	PENDING_DESIGN_FILES("Pending Design Files"),
	REJECTED("Rejected"),
	
	//Level 2 Status
	SENT_FOR_APPROVAL("L2 Sent To NH & TH"),
	SENT_BACK("L2 Sent Back By NH"),
	APPROVED_BY_NATIONAL_HEAD("Pending Transformation's Approval"),
	SENT_BACK_BY_TRANSFORMATION("Sent Back By Transformations"),
	APPROVED_BY_TRANSFORMATION("Pending NH's Approval"),
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
	SENT_BACK_BY_LEADERSHIP("Sent Back By Andy"),
	APPROVED_BY_LEADERSHIP("Property Naming Done"),


	SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD("L1 Sent to NH"),
	SENT_FOR_L1_APPROVAL_TO_LEADERSHIP("L1 Sent to Andy"),
	APPROVED_L1_BY_LEADERSHIP("L1 Approved by Andy"),
	SENT_BACK_L1_BY_NATIONAL_HEAD("L1 Sent Back by NH"),
	SENT_BACK_L1_BY_LEADERSHIP("L1 Sent Back by Andy"),

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

	public static List<EstateStatus> getTransformationStatus(){

		List<EstateStatus> transformationStatusesList = new ArrayList<>();

		transformationStatusesList.add(SENT_FOR_APPROVAL);
		transformationStatusesList.add(SENT_BACK);
		transformationStatusesList.add(APPROVED_BY_NATIONAL_HEAD);
		transformationStatusesList.add(SENT_BACK_BY_TRANSFORMATION);
		transformationStatusesList.add(APPROVED_BY_TRANSFORMATION);
		transformationStatusesList.add(SHORTLISTED);
		transformationStatusesList.add(SENT_TO_CENTRAL_BD_TEAM);
		transformationStatusesList.add(SENT_BACK_BY_CENTRAL_BD_TEAM);
		transformationStatusesList.add(SENT_TO_LEGAL);
		transformationStatusesList.add(SENT_BACK_BY_LEGAL);
		transformationStatusesList.add(SIGNED_ATL_UPLOADED);
		transformationStatusesList.add(ATL_UPLOAD_PENDING);
		transformationStatusesList.add(SENT_BACK_BY_LEADERSHIP);
		transformationStatusesList.add(APPROVED_BY_LEADERSHIP);
		transformationStatusesList.add(SENT_FOR_SANDEEP_APPROVAL);
		transformationStatusesList.add(SENT_BACK_BY_SANDEEP);
		
		return transformationStatusesList;
	}

	public static List<EstateStatus> getLegalStatus(){

		List<EstateStatus> transformationStatusesList = new ArrayList<>();

		transformationStatusesList.add(SENT_FOR_APPROVAL);
		transformationStatusesList.add(SENT_BACK);
		transformationStatusesList.add(APPROVED_BY_NATIONAL_HEAD);
		transformationStatusesList.add(SENT_BACK_BY_TRANSFORMATION);
		transformationStatusesList.add(APPROVED_BY_TRANSFORMATION);
		transformationStatusesList.add(SHORTLISTED);
		transformationStatusesList.add(SENT_TO_CENTRAL_BD_TEAM);
		transformationStatusesList.add(SENT_BACK_BY_CENTRAL_BD_TEAM);
		transformationStatusesList.add(SENT_TO_LEGAL);
		transformationStatusesList.add(SENT_BACK_BY_LEGAL);
		transformationStatusesList.add(SIGNED_ATL_UPLOADED);
		transformationStatusesList.add(ATL_UPLOAD_PENDING);
		transformationStatusesList.add(SENT_BACK_BY_LEADERSHIP);
		transformationStatusesList.add(APPROVED_BY_LEADERSHIP);
		transformationStatusesList.add(SENT_FOR_SANDEEP_APPROVAL);
		transformationStatusesList.add(SENT_BACK_BY_SANDEEP);
		
		return transformationStatusesList;
	}

	
	public static List<EstateStatus> getSendForApprovalStatuses() {
		List<EstateStatus> sendForApprovalStatusesList = new ArrayList<>();
		sendForApprovalStatusesList.add(SENT_FOR_APPROVAL_TO_CITY_HEAD);
		sendForApprovalStatusesList.add(SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES);
		sendForApprovalStatusesList.add(PENDING_INITIAL_BED_COUNT);
		
		sendForApprovalStatusesList.add(SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD);
		sendForApprovalStatusesList.add(SENT_FOR_L1_APPROVAL_TO_LEADERSHIP);
		
		sendForApprovalStatusesList.add(SENT_FOR_APPROVAL);
		sendForApprovalStatusesList.add(APPROVED_BY_NATIONAL_HEAD);
		sendForApprovalStatusesList.add(APPROVED_BY_TRANSFORMATION);
		
		sendForApprovalStatusesList.add(SENT_FOR_SANDEEP_APPROVAL);
		sendForApprovalStatusesList.add(SENT_TO_LEGAL);	
		sendForApprovalStatusesList.add(SIGNED_ATL_UPLOADED);
		
		
		return sendForApprovalStatusesList;	
	}
	
	public static List<EstateStatus> getSentBackByStatuses() {
		List<EstateStatus> sendBackByStatusesList = new ArrayList<>();
		
		sendBackByStatusesList.add(SENT_BACK_BY_CITY_HEAD);
		sendBackByStatusesList.add(SENT_BACK_FROM_INITIAL_BED_COUNT);
		sendBackByStatusesList.add(SENT_BACK_L1_BY_NATIONAL_HEAD);
		
		sendBackByStatusesList.add(SENT_BACK_L1_BY_LEADERSHIP);
		sendBackByStatusesList.add(SENT_BACK);
		
		sendBackByStatusesList.add(SENT_BACK_BY_TRANSFORMATION);
		sendBackByStatusesList.add(SENT_BACK_BY_SANDEEP);
		sendBackByStatusesList.add(SENT_BACK_BY_LEGAL);
		
		sendBackByStatusesList.add(SENT_BACK_BY_LEADERSHIP);
		
		
		return sendBackByStatusesList;	
	}
	
	public static List<EstateStatus> getPendingAtBDStatuses() {
		List<EstateStatus> pendingAtBdStatus = new ArrayList<>();
		
		pendingAtBdStatus.add(PENDING_DESIGN_FILES);
		pendingAtBdStatus.add(APPROVED_L1_BY_LEADERSHIP);
		pendingAtBdStatus.add(ATL_UPLOAD_PENDING);
		
		return pendingAtBdStatus;	
	}
	
	public static List<EstateStatus> getPropertyNamingDone() {
		List<EstateStatus> propertyNamingDoneList = new ArrayList<>();
		
		propertyNamingDoneList.add(APPROVED_BY_LEADERSHIP);
		
		return propertyNamingDoneList;	
	}
	
	public static LinkedHashMap<String,List<EstateStatus>> bdQuickFilters() {

		LinkedHashMap<String,List<EstateStatus>> bdFilters = new LinkedHashMap<>(); 
		
		bdFilters.put("Under Draft", Arrays.asList(DRAFT_IN_PROGRESS));
		bdFilters.put("Pending Action", Arrays.asList(APPROVED_L1_BY_LEADERSHIP,ATL_UPLOAD_PENDING));
		bdFilters.put("Sent Back", Arrays.asList(SENT_BACK_BY_CITY_HEAD,SENT_BACK_L1_BY_NATIONAL_HEAD,SENT_BACK_L1_BY_LEADERSHIP,SENT_BACK_FROM_INITIAL_BED_COUNT));
		return bdFilters;	
	}


	public static LinkedHashMap<String,List<EstateStatus>> rmQuickFilters() {

		LinkedHashMap<String,List<EstateStatus>> bdFilters = new LinkedHashMap<>(); 
		
		bdFilters.put("Under Draft", Arrays.asList(DRAFT_IN_PROGRESS));
		bdFilters.put("Pending Approval", Arrays.asList(SENT_FOR_APPROVAL_TO_CITY_HEAD,SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES));
		bdFilters.put("Sent Back", Arrays.asList(SENT_BACK,SENT_BACK_BY_TRANSFORMATION,SENT_BACK_BY_LEGAL,SENT_BACK_BY_SANDEEP,SENT_BACK_BY_LEADERSHIP,SENT_BACK_L1_BY_NATIONAL_HEAD,SENT_BACK_L1_BY_LEADERSHIP,SENT_BACK_FROM_INITIAL_BED_COUNT));
		bdFilters.put("Pending Action", Arrays.asList(APPROVED_L1_BY_LEADERSHIP,PENDING_DESIGN_FILES));
		return bdFilters;
	}

	
	public static List<EstateStatus> getPropertyUnderDraft() {
		List<EstateStatus> propertyUnderDraftList = new ArrayList<>();
		
		propertyUnderDraftList.add(DRAFT_IN_PROGRESS);
		
		return propertyUnderDraftList;	
	}
}
