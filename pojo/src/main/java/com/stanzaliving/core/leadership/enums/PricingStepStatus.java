package com.stanzaliving.core.leadership.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.estate.enums.EstateStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PricingStepStatus{
	
	//PENDING_APPROVAL("Pending Approval","#FF9902"), SENT_BACK("Sent Back","#DC3913"),  APPROVED("Approved By Leadership","#3366CC"),UNDER_DRAFT("Under Draft","#990199");
	
	UNDER_DRAFT("Under Draft",
			Arrays.asList(EstateStatus.DRAFT_IN_PROGRESS, EstateStatus.APPROVED_BY_CITY_HEAD,
					EstateStatus.SENT_BACK_BY_CITY_HEAD,
					EstateStatus.REJECTED,EstateStatus.SENT_BACK_L1_BY_NATIONAL_HEAD,EstateStatus.SENT_BACK_FROM_INITIAL_BED_COUNT),
			"#bfbfbf", 1),
	PENDING_RM_APPROVAL("Pending RM Approval", Arrays.asList(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD,EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES), "#4183d7",2),
	PENDING_DESIGN_FILES("Pending Design Files", Arrays.asList(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD,EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES), "#D5A6BD",3),
	PENDING_INITIAL_BED_COUNT("Pending Initial Bed Count", Arrays.asList(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD,EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES), "#9C416E",4),

	PENDING_L1_APPROVAL("Pending L1 Andy Approval", Arrays.asList(EstateStatus.SENT_FOR_L1_APPROVAL_TO_LEADERSHIP), "#806600" ,5),
	L1_APPROVED("Pending L2 Details", Arrays.asList(EstateStatus.APPROVED_L1_BY_LEADERSHIP,EstateStatus.SENT_BACK_BY_TRANSFORMATION,EstateStatus.SENT_BACK), "#6bb9f0" ,6),
	PENDING_NATIONAL_HEAD_APPROVAL("Pending BD Head Approval",
			Arrays.asList(EstateStatus.SENT_FOR_APPROVAL, EstateStatus.APPROVED_BY_TRANSFORMATION,
					EstateStatus.SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD), "#f03434" ,7),
	PENDING_TRANSFORMATIONS_APPROVAL("Pending Transformations Approval", Arrays.asList(EstateStatus.APPROVED_BY_NATIONAL_HEAD), "#e87e04" ,8),
	PENDING_SANDEEP_APPROVAL("Pending Sandeep Approval", Arrays.asList(EstateStatus.SENT_FOR_SANDEEP_APPROVAL), "#2ab379" ,9),
	SENT_BACK_BY_SANDEEP("Sent Back by Sandeep", Arrays.asList(EstateStatus.SENT_FOR_SANDEEP_APPROVAL), "#8d6f6f" ,10),

	PENDING_LEGAL_APPROVAL("Pending Legal Approval", Arrays.asList(EstateStatus.SENT_TO_CENTRAL_BD_TEAM,EstateStatus.SENT_TO_LEGAL), "#4d05e8" ,11),
	PENDING_ANDY_APPROVAL("Pending Andy Approval", Arrays.asList(EstateStatus.SIGNED_ATL_UPLOADED), "#f7ca18" ,12),
	SENT_BACK("Sent Back",Arrays.asList(EstateStatus.SENT_BACK_BY_LEADERSHIP, EstateStatus.SENT_BACK_L1_BY_LEADERSHIP),"#00b5cc" ,13),
	PENDING_ATL_UPLOADING("Pending ATL Uploading", Arrays.asList(EstateStatus.ATL_UPLOAD_PENDING,EstateStatus.SHORTLISTED,EstateStatus.SENT_BACK_BY_CENTRAL_BD_TEAM, EstateStatus.SENT_BACK_BY_LEGAL), "#131313" ,14),
	PROPERTY_NAMING_DONE("Property Naming Done", Arrays.asList(EstateStatus.APPROVED_BY_LEADERSHIP), "#019875" ,15),
    DROPPED("Property Naming Done", Arrays.asList(EstateStatus.DROPPED), "#019875" ,16);

	private String pricingStatus;
	
	private List<EstateStatus> estateStatuses;
	
	private String color;
	
	//matain the status order
	private int statusOrder;

	
	public static Map<EstateStatus, PricingStepStatus> statusMap = new HashMap<EstateStatus, PricingStepStatus>(
			PricingStepStatus.values().length);

	static {

		//Under Draft
		statusMap.put(EstateStatus.DRAFT_IN_PROGRESS, UNDER_DRAFT);
		statusMap.put(EstateStatus.APPROVED_BY_CITY_HEAD, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_CITY_HEAD, UNDER_DRAFT);
		statusMap.put(EstateStatus.REJECTED, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_L1_BY_NATIONAL_HEAD,UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_FROM_INITIAL_BED_COUNT, UNDER_DRAFT);
		statusMap.put(EstateStatus.PENDING_SALES_APPROVAL, UNDER_DRAFT);
		//Pending Andy Approval
		statusMap.put(EstateStatus.SIGNED_ATL_UPLOADED, PENDING_ANDY_APPROVAL);
		
		//Pending RM Approval
		statusMap.put(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD, PENDING_RM_APPROVAL);
		statusMap.put(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES, PENDING_RM_APPROVAL);

		//Status for designs
		statusMap.put(EstateStatus.PENDING_DESIGN_FILES, PENDING_DESIGN_FILES);
		statusMap.put(EstateStatus.PENDING_INITIAL_BED_COUNT, PENDING_INITIAL_BED_COUNT);
		
		//Pending National Head Approval
		statusMap.put(EstateStatus.SENT_FOR_APPROVAL, PENDING_NATIONAL_HEAD_APPROVAL);
		statusMap.put(EstateStatus.APPROVED_BY_TRANSFORMATION, PENDING_NATIONAL_HEAD_APPROVAL);
		statusMap.put(EstateStatus.SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD, PENDING_NATIONAL_HEAD_APPROVAL);

		//Property Naming Done
		statusMap.put(EstateStatus.APPROVED_BY_LEADERSHIP, PROPERTY_NAMING_DONE);
		
		//Pending Transformations Approval
		statusMap.put(EstateStatus.APPROVED_BY_NATIONAL_HEAD, PENDING_TRANSFORMATIONS_APPROVAL);
		
		//Pending Legal Approval
		statusMap.put(EstateStatus.SENT_TO_CENTRAL_BD_TEAM, PENDING_LEGAL_APPROVAL);
		statusMap.put(EstateStatus.SENT_TO_LEGAL, PENDING_LEGAL_APPROVAL);
		
		//Sent Back
		statusMap.put(EstateStatus.SENT_BACK_BY_LEADERSHIP, SENT_BACK);
		statusMap.put(EstateStatus.SENT_BACK_L1_BY_LEADERSHIP, SENT_BACK);

		//Pending ATL Upload
		statusMap.put(EstateStatus.ATL_UPLOAD_PENDING, PENDING_ATL_UPLOADING);
		statusMap.put(EstateStatus.SHORTLISTED, PENDING_ATL_UPLOADING);
		statusMap.put(EstateStatus.SENT_BACK_BY_LEGAL, PENDING_ATL_UPLOADING);
		statusMap.put(EstateStatus.SENT_BACK_BY_CENTRAL_BD_TEAM, PENDING_ATL_UPLOADING);

		//L1 Flow
		statusMap.put(EstateStatus.SENT_FOR_L1_APPROVAL_TO_LEADERSHIP,PENDING_L1_APPROVAL);
		statusMap.put(EstateStatus.APPROVED_L1_BY_LEADERSHIP,L1_APPROVED);
		statusMap.put(EstateStatus.SENT_BACK_BY_TRANSFORMATION, L1_APPROVED);
		statusMap.put(EstateStatus.SENT_BACK,L1_APPROVED);

		statusMap.put(EstateStatus.SENT_FOR_SANDEEP_APPROVAL, PENDING_SANDEEP_APPROVAL);
		statusMap.put(EstateStatus.SENT_BACK_BY_SANDEEP, SENT_BACK_BY_SANDEEP);
		
		statusMap.put(EstateStatus.DROPPED, DROPPED);


	}
}
