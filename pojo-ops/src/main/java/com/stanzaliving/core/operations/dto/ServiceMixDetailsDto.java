package com.stanzaliving.core.operations.dto;

import com.stanzaliving.approval.enums.ApprovalStatus;

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
public class ServiceMixDetailsDto {

	private String serviceMixUuid;
	private String serviceMixName;
	private ApprovalStatus serviceMixApprovalStatus;
	private String approvalStatusDisplayName;
	private boolean isDefault;
	
}
