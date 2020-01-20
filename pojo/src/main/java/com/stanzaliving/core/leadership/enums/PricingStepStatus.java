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
			Arrays.asList(EstateStatus.DRAFT_IN_PROGRESS, EstateStatus.APPROVED_BY_CITY_HEAD, EstateStatus.SENT_BACK,
					EstateStatus.SENT_BACK_BY_CITY_HEAD, EstateStatus.SENT_BACK,
					EstateStatus.SENT_BACK_BY_TRANSFORMATION, EstateStatus.SENT_BACK_BY_LEGAL,
					EstateStatus.SENT_BACK_BY_CENTRAL_BD_TEAM,EstateStatus.REJECTED),
			"#990199"),
	PENDING_ANDY_APPROVAL("Pending Andy Approval", Arrays.asList(EstateStatus.SIGNED_ATL_UPLOADED), "#E6194B"),
	PENDING_RM_APPROVAL("Pending RM Approval", Arrays.asList(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD), "#FFE119"),
	PENDING_NATIONAL_HEAD_APPROVAL("Pending BD Head Approval",
			Arrays.asList(EstateStatus.SENT_FOR_APPROVAL, EstateStatus.APPROVED_BY_TRANSFORMATION), "#000000"),
	PROPERTY_NAMING_DONE("Property Naming Done", Arrays.asList(EstateStatus.APPROVED_BY_LEADERSHIP), "#E6BEFF"),
	PENDING_TRANSFORMATIONS_APPROVAL("Pending Transformations Approval", Arrays.asList(EstateStatus.APPROVED_BY_NATIONAL_HEAD), "#FABEBE"),
	PENDING_LEGAL_APPROVAL("Pending Legal Approval", Arrays.asList(EstateStatus.SENT_TO_CENTRAL_BD_TEAM,EstateStatus.SENT_TO_LEGAL), "#42D4F4"),
	SENT_BACK("Sent Back",Arrays.asList(EstateStatus.SENT_BACK_BY_LEADERSHIP),"#3CB44B"),
	PENDING_ATL_UPLOADING("Pending ATL Uploading", Arrays.asList(EstateStatus.ATL_UPLOAD_PENDING,EstateStatus.SHORTLISTED), "#9A6324"),
	PENDING_L1_APPROVAL("Pending L1 Approval Leadership", Arrays.asList(EstateStatus.SENT_FOR_L1_APPROVAL_TO_LEADERSHIP), "#9A6324");

	private String pricingStatus;
	
	private List<EstateStatus> estateStatuses;
	
	private String color;

	
	public static Map<EstateStatus, PricingStepStatus> statusMap = new HashMap<EstateStatus, PricingStepStatus>(
			PricingStepStatus.values().length);

	static {

		//Under Draft
		statusMap.put(EstateStatus.DRAFT_IN_PROGRESS, UNDER_DRAFT);
		statusMap.put(EstateStatus.APPROVED_BY_CITY_HEAD, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_CITY_HEAD, UNDER_DRAFT);
		statusMap.put(EstateStatus.REJECTED, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_TRANSFORMATION, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_LEGAL, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_CENTRAL_BD_TEAM, UNDER_DRAFT);
		
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
		statusMap.put(EstateStatus.SENT_BACK_BY_LEADERSHIP, SENT_BACK);

		//Pending ATL Upload
		statusMap.put(EstateStatus.ATL_UPLOAD_PENDING, PENDING_ATL_UPLOADING);
		statusMap.put(EstateStatus.SHORTLISTED, PENDING_ATL_UPLOADING);
		
	}
}
