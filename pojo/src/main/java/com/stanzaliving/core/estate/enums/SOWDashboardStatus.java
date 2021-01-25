package com.stanzaliving.core.estate.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SOWDashboardStatus {

	PENDING_SOW_APPROVAL("Pending SOW Approval", SOWStatus.PENDING_SOW_APPROVAL, "#DC3913" ,1),
	SOW_SENT_BACK("SOW Sent Back", SOWStatus.SOW_SENT_BACK, "#FF9902" , 2),
	SOW_APPROVED("SOW Approved", SOWStatus.SOW_APPROVED, "#3366CC" , 3),
	PENDING_SANDEEP_APPROVAL("Pending Sandeep Approval",SOWStatus.PENDING_SANDEEP_APPROVAL,"#8d6f6f",4),
	SENT_BACK_BY_SANDEEP("Sent Back by Sandeep",SOWStatus.SENT_BACK_BY_SANDEEP,"#00b5cc",5);

	private String status;

	private SOWStatus sowStatus;

	private String color;
	private int statusOrder;

	public static  Map<SOWStatus, SOWDashboardStatus> statusMap = new HashMap<>(SOWDashboardStatus.values().length);

	public static  Map<SOWDashboardStatus, List<EstateStatus>> sowToEstateStatusMapping = new HashMap<>(SOWDashboardStatus.values().length);
	public static  Map<EstateStatus, SOWDashboardStatus> estateStatusToSowStatusMapping = new HashMap<>();



	static {

		statusMap.put(SOWStatus.PENDING_SOW_APPROVAL, PENDING_SOW_APPROVAL);
		statusMap.put(SOWStatus.SOW_SENT_BACK, SOW_SENT_BACK);
		statusMap.put(SOWStatus.SOW_APPROVED, SOW_APPROVED);

		sowToEstateStatusMapping.put(PENDING_SOW_APPROVAL, Arrays.asList(EstateStatus.APPROVED_BY_NATIONAL_HEAD,
				EstateStatus.SENT_FOR_APPROVAL));
		sowToEstateStatusMapping.put(SOW_SENT_BACK, Arrays.asList(EstateStatus.SENT_BACK_BY_TRANSFORMATION));
		sowToEstateStatusMapping.put(SOW_APPROVED, Arrays.asList(EstateStatus.APPROVED_BY_TRANSFORMATION,
				EstateStatus.APPROVED_BY_LEADERSHIP,
				EstateStatus.ATL_UPLOAD_PENDING,
				EstateStatus.SHORTLISTED,
				EstateStatus.SIGNED_ATL_UPLOADED,
				EstateStatus.SENT_TO_LEGAL,
				EstateStatus.SENT_TO_CENTRAL_BD_TEAM,
				EstateStatus.SENT_BACK_BY_CENTRAL_BD_TEAM,
				EstateStatus.SENT_BACK_BY_LEGAL));
		sowToEstateStatusMapping.put(PENDING_SANDEEP_APPROVAL, Arrays.asList(EstateStatus.SENT_FOR_SANDEEP_APPROVAL));
		sowToEstateStatusMapping.put(SENT_BACK_BY_SANDEEP, Arrays.asList(EstateStatus.SENT_BACK_BY_SANDEEP));


		estateStatusToSowStatusMapping.put(EstateStatus.APPROVED_BY_NATIONAL_HEAD,PENDING_SOW_APPROVAL);
		estateStatusToSowStatusMapping.put(EstateStatus.SENT_FOR_APPROVAL,PENDING_SOW_APPROVAL);
		estateStatusToSowStatusMapping.put(EstateStatus.SENT_BACK_BY_TRANSFORMATION,SOW_SENT_BACK);
		estateStatusToSowStatusMapping.put(EstateStatus.SENT_FOR_SANDEEP_APPROVAL,PENDING_SANDEEP_APPROVAL);
		estateStatusToSowStatusMapping.put(EstateStatus.SENT_BACK_BY_SANDEEP,SENT_BACK_BY_SANDEEP);

		estateStatusToSowStatusMapping.put(EstateStatus.APPROVED_BY_TRANSFORMATION,SOW_APPROVED);
		estateStatusToSowStatusMapping.put(EstateStatus.APPROVED_BY_LEADERSHIP,SOW_APPROVED);
		estateStatusToSowStatusMapping.put(EstateStatus.ATL_UPLOAD_PENDING,SOW_APPROVED);
		estateStatusToSowStatusMapping.put(EstateStatus.SHORTLISTED,SOW_APPROVED);
		estateStatusToSowStatusMapping.put(EstateStatus.SIGNED_ATL_UPLOADED,SOW_APPROVED);
		estateStatusToSowStatusMapping.put(EstateStatus.SENT_TO_LEGAL,SOW_APPROVED);
		estateStatusToSowStatusMapping.put(EstateStatus.SENT_TO_CENTRAL_BD_TEAM,SOW_APPROVED);
		estateStatusToSowStatusMapping.put(EstateStatus.SENT_BACK_BY_CENTRAL_BD_TEAM,SOW_APPROVED);
		estateStatusToSowStatusMapping.put(EstateStatus.SENT_BACK_BY_LEGAL,SOW_APPROVED);

	}
}
