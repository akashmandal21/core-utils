package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.approval.enums.ApprovalStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class ApprovalDataDto {
	private ApprovalStatus approvalStatus;
	private String status;
	private String textColor;
	private String bgColor;
}
