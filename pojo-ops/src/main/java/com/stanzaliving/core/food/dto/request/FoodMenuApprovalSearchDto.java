/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.approval.enums.ApprovalStatus;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuApprovalSearchDto {
	private String cityId;
	private String microMarketId;
	private String residenceId;
	private ApprovalStatus approvalStatus;
	private Boolean operational;
	
}