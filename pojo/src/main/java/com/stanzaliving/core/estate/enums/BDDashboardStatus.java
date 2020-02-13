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
			Arrays.asList(EstateStatus.DRAFT_IN_PROGRESS, EstateStatus.APPROVED_BY_CITY_HEAD,EstateStatus.SENT_BACK_BY_CITY_HEAD,EstateStatus.REJECTED),"#bfbfbf" ,1),
	
	PENDING_RM_APPROVAL("Pending RM Approval", Arrays.asList(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD), "#4183d7" ,2),
	L1_APPROVED_LEADERSHIP(	"Pending L2 Details", Arrays.asList(EstateStatus.APPROVED_L1_BY_LEADERSHIP,EstateStatus.SENT_BACK_BY_TRANSFORMATION),"#6bb9f0",3),
	PENDING_L1_APPROVAL_NATIONAL_HEAD("Pending L1 BD Head Approval", Arrays.asList(EstateStatus.SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD),"#f1a9a0",4),
	PENDING_NATIONAL_HEAD_APPROVAL("Pending BD Head Approval",
			Arrays.asList(EstateStatus.SENT_FOR_APPROVAL, EstateStatus.APPROVED_BY_TRANSFORMATION), "#f03434",5),
	SENT_BACK("Sent Back",Arrays.asList(EstateStatus.SENT_BACK,EstateStatus.SENT_BACK_L1_BY_NATIONAL_HEAD),"#00b5cc",6),
	
	L1_SENT_BACK_BY_ANDY("L1 Sent Back by Andy",Arrays.asList( EstateStatus.SENT_BACK_L1_BY_LEADERSHIP),"#d5a6bd",7),
	
	PENDING_TRANSFORMATIONS_APPROVAL("Pending Transformations Approval", Arrays.asList(EstateStatus.APPROVED_BY_NATIONAL_HEAD), "#e87e04",8),
	PENDING_SANDEEP_APPROVAL("Pending Sandeep Approval", Arrays.asList(EstateStatus.SENT_FOR_SANDEEP_APPROVAL), "#2ab379",9),
	SENT_BACK_BY_SANDEEP("Sent Back by Sandeep", Arrays.asList(EstateStatus.SENT_BACK_BY_SANDEEP), "#8d6f6f",10),
	PENDING_LEGAL_APPROVAL("Pending Legal Approval", Arrays.asList(EstateStatus.SENT_TO_CENTRAL_BD_TEAM,EstateStatus.SENT_TO_LEGAL), "#4d05e8",11),
	PENDING_ANDY_APPROVAL("Pending Andy Approval", Arrays.asList(EstateStatus.SENT_FOR_L1_APPROVAL_TO_LEADERSHIP,EstateStatus.SIGNED_ATL_UPLOADED), "#f7ca18",12),
	L2_SENT_BACK_BY_ANDY("L2 Sent Back by Andy",Arrays.asList(  EstateStatus.SENT_BACK_BY_LEADERSHIP),"#00ffd9",13),
	PENDING_ATL_UPLOADING("Pending ATL Upload", Arrays.asList(EstateStatus.ATL_UPLOAD_PENDING,EstateStatus.SHORTLISTED,EstateStatus.SENT_BACK_BY_LEGAL,EstateStatus.SENT_BACK_BY_CENTRAL_BD_TEAM), "#e8e8e8",14),
	PROPERTY_NAMING_DONE("Property Naming Done", Arrays.asList(EstateStatus.APPROVED_BY_LEADERSHIP), "#019875",15);

	private String status;

	private List<EstateStatus> estateStatuses;

	private String color;
	private int statusOrder;
	
	public static Map<EstateStatus, BDDashboardStatus> statusMap = new HashMap<EstateStatus, BDDashboardStatus>(
			BDDashboardStatus.values().length);

	static {

		//Under Draft
		statusMap.put(EstateStatus.DRAFT_IN_PROGRESS, UNDER_DRAFT);
		statusMap.put(EstateStatus.APPROVED_BY_CITY_HEAD, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_LEADERSHIP, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_CITY_HEAD, UNDER_DRAFT);
		statusMap.put(EstateStatus.REJECTED, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_L1_BY_LEADERSHIP,UNDER_DRAFT);

		//Pending RM Approval
		statusMap.put(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD, PENDING_RM_APPROVAL);

		//L1 approval
		statusMap.put(EstateStatus.SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD,PENDING_L1_APPROVAL_NATIONAL_HEAD);

		//L2 Pending
		statusMap.put(EstateStatus.APPROVED_L1_BY_LEADERSHIP,L1_APPROVED_LEADERSHIP);
		statusMap.put(EstateStatus.SENT_BACK_BY_TRANSFORMATION, L1_APPROVED_LEADERSHIP);


		//Pending Andy Approval
		statusMap.put(EstateStatus.SIGNED_ATL_UPLOADED, PENDING_ANDY_APPROVAL);
		statusMap.put(EstateStatus.SENT_FOR_L1_APPROVAL_TO_LEADERSHIP, PENDING_ANDY_APPROVAL);

		//Pending National Head Approval
		statusMap.put(EstateStatus.SENT_FOR_APPROVAL, PENDING_NATIONAL_HEAD_APPROVAL);
		statusMap.put(EstateStatus.APPROVED_BY_TRANSFORMATION, PENDING_NATIONAL_HEAD_APPROVAL);
		
		//Property Naming Done
		statusMap.put(EstateStatus.APPROVED_BY_LEADERSHIP, PROPERTY_NAMING_DONE);
		
		//Pending Transformations Approval
		statusMap.put(EstateStatus.APPROVED_BY_NATIONAL_HEAD, PENDING_TRANSFORMATIONS_APPROVAL);

		//Sandy approval flow
		statusMap.put(EstateStatus.SENT_FOR_SANDEEP_APPROVAL,PENDING_SANDEEP_APPROVAL);
		statusMap.put(EstateStatus.SENT_BACK_BY_SANDEEP,SENT_BACK_BY_SANDEEP);

		//Pending Legal Approval
		statusMap.put(EstateStatus.SENT_TO_CENTRAL_BD_TEAM, PENDING_LEGAL_APPROVAL);
		statusMap.put(EstateStatus.SENT_TO_LEGAL, PENDING_LEGAL_APPROVAL);
		
		//Sent Back
		statusMap.put(EstateStatus.SENT_BACK, SENT_BACK);
		statusMap.put(EstateStatus.SENT_BACK_L1_BY_NATIONAL_HEAD, SENT_BACK);
		
		//L1 & L2 sent back by Andy
		statusMap.put(EstateStatus.SENT_BACK_L1_BY_LEADERSHIP, L1_SENT_BACK_BY_ANDY);
		statusMap.put(EstateStatus.SENT_BACK_BY_LEADERSHIP, L2_SENT_BACK_BY_ANDY);

		//Pending ATL Upload
		statusMap.put(EstateStatus.ATL_UPLOAD_PENDING, PENDING_ATL_UPLOADING);
		statusMap.put(EstateStatus.SHORTLISTED, PENDING_ATL_UPLOADING);
		statusMap.put(EstateStatus.SENT_BACK_BY_LEGAL, PENDING_ATL_UPLOADING);
		statusMap.put(EstateStatus.SENT_BACK_BY_CENTRAL_BD_TEAM, PENDING_ATL_UPLOADING);

	}
}
