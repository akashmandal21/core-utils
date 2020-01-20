package com.stanzaliving.core.estate.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BDDashboardStatus {

	UNDER_DRAFT("Under Draft",
			Arrays.asList(EstateStatus.DRAFT_IN_PROGRESS, EstateStatus.APPROVED_BY_CITY_HEAD, 
					EstateStatus.SENT_BACK_BY_CITY_HEAD, EstateStatus.SENT_BACK_BY_LEADERSHIP,
					EstateStatus.SENT_BACK_BY_TRANSFORMATION, EstateStatus.SENT_BACK_BY_LEGAL,
					EstateStatus.SENT_BACK_BY_CENTRAL_BD_TEAM,EstateStatus.REJECTED, EstateStatus.SENT_BACK_L1_BY_LEADERSHIP,
					EstateStatus.SENT_BACK_L1_BY_NATIONAL_HEAD),
			"#990199"),
	PENDING_ANDY_APPROVAL("Pending Andy Approval", Arrays.asList(EstateStatus.SIGNED_ATL_UPLOADED), "#FFE119"),
	PENDING_RM_APPROVAL("Pending RM Approval", Arrays.asList(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD), "#000000"),
	PENDING_NATIONAL_HEAD_APPROVAL("Pending BD Head Approval",
			Arrays.asList(EstateStatus.SENT_FOR_APPROVAL, EstateStatus.APPROVED_BY_TRANSFORMATION), "#E6BEFF"),
	PROPERTY_NAMING_DONE("Property Naming Done", Arrays.asList(EstateStatus.APPROVED_BY_LEADERSHIP), "#FABEBE"),
	PENDING_TRANSFORMATIONS_APPROVAL("Pending Transformations Approval", Arrays.asList(EstateStatus.APPROVED_BY_NATIONAL_HEAD), "#42D4F4"),
	PENDING_LEGAL_APPROVAL("Pending Legal Approval", Arrays.asList(EstateStatus.SENT_TO_CENTRAL_BD_TEAM,EstateStatus.SENT_TO_LEGAL), "#E6194B"),
	SENT_BACK("Sent Back",Arrays.asList(EstateStatus.SENT_BACK),"#3CB44B"),
	PENDING_ATL_UPLOADING("Pending ATL Uploading", Arrays.asList(EstateStatus.ATL_UPLOAD_PENDING,EstateStatus.SHORTLISTED), "#9A6324"),
	PENDING_L1_APPROVAL_NATIONAL_HEAD("Pending in L1 Approval Flow", Arrays.asList(EstateStatus.SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD),"#FFE112"),
	PENDING_L1_APPROVAL_LEADERSHIP(	"Pending in L1 Approval Flow", Arrays.asList(EstateStatus.SENT_FOR_L1_APPROVAL_TO_LEADERSHIP),"#FFE612");

	private String status;

	private List<EstateStatus> estateStatuses;

	private String color;

	public static Map<EstateStatus, BDDashboardStatus> statusMap = new HashMap<EstateStatus, BDDashboardStatus>(
			BDDashboardStatus.values().length);

	static {

		//Under Draft
		statusMap.put(EstateStatus.DRAFT_IN_PROGRESS, UNDER_DRAFT);
		statusMap.put(EstateStatus.APPROVED_BY_CITY_HEAD, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_LEADERSHIP, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_CITY_HEAD, UNDER_DRAFT);
		statusMap.put(EstateStatus.REJECTED, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_TRANSFORMATION, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_LEGAL, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_CENTRAL_BD_TEAM, UNDER_DRAFT);

		statusMap.put(EstateStatus.SENT_BACK_L1_BY_LEADERSHIP,UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_L1_BY_NATIONAL_HEAD,UNDER_DRAFT);

		//L1 approval
		statusMap.put(EstateStatus.SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD,PENDING_L1_APPROVAL_NATIONAL_HEAD);
		statusMap.put(EstateStatus.SENT_FOR_L1_APPROVAL_TO_LEADERSHIP,PENDING_L1_APPROVAL_LEADERSHIP);

		//Pending Andy Approval
		statusMap.put(EstateStatus.SIGNED_ATL_UPLOADED, PENDING_ANDY_APPROVAL);
		
		//Pending RM Approval
		statusMap.put(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD, PENDING_RM_APPROVAL);

		//Pending National Head Approval
		statusMap.put(EstateStatus.SENT_FOR_APPROVAL, PENDING_NATIONAL_HEAD_APPROVAL);
		statusMap.put(EstateStatus.APPROVED_BY_TRANSFORMATION, PENDING_NATIONAL_HEAD_APPROVAL);
		
		//Property Naming Done
		statusMap.put(EstateStatus.APPROVED_BY_LEADERSHIP, PROPERTY_NAMING_DONE);
		
		//Pending Transformations Approval
		statusMap.put(EstateStatus.APPROVED_BY_NATIONAL_HEAD, PENDING_TRANSFORMATIONS_APPROVAL);
		
		//Pending Legal Approval
		statusMap.put(EstateStatus.SENT_TO_CENTRAL_BD_TEAM, PENDING_LEGAL_APPROVAL);
		statusMap.put(EstateStatus.SENT_TO_LEGAL, PENDING_LEGAL_APPROVAL);
		
		//Sent Back
		statusMap.put(EstateStatus.SENT_BACK, SENT_BACK);

		//Pending ATL Upload
		statusMap.put(EstateStatus.ATL_UPLOAD_PENDING, PENDING_ATL_UPLOADING);
		statusMap.put(EstateStatus.SHORTLISTED, PENDING_ATL_UPLOADING);
		
	}
}
