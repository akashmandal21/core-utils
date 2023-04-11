package com.stanzaliving.core.operations.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.operations.enums.ServiceMixStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class DealServiceMixListingDto {
	
	private String uuid;
	private String versionName;
	private String displayName;
	private Long version;
	private LocalDate fromDate;
	private LocalDate toDate;
	private String createdBy;
	private ServiceMixStatus serviceMixStatus;
	private ApprovalStatus approvalStatus;
	private String dealUuid;
	private String displayApprovalText;
	private DealCategory dealCategory;
	private boolean isDefault;
	private Long residentOnBoardCount;
	
	private Date serviceMixApprovedOn;
	private String approvalPendingBy;
	
	private List<String> serviceList;
	private Map<String, String> tags;
}
