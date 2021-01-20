/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.approval.enums.ApprovalStatus;
import lombok.*;

import java.time.LocalDate;

/**
 * @author naveen.kumar
 *
 * @date 06-May-2020
 *
 **/
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