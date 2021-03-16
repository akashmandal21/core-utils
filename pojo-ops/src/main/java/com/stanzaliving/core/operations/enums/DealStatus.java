/**
 * 
 */
package com.stanzaliving.core.operations.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author manish.pareek
 *
 * @date 05-Feb-2021
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum DealStatus {
	UNDER_DRAFT("Under Draft", 3), 
	SUBMITTED("Submitted", 2), 
	CANCELLED("Cancelled", 5), 
	APPROVED("Approved", 1),
	ON_HOLD("On Hold", 4), 
	EXPIRED("Expired", 6),
	REJECTED("Rejected", 7), 
	MERGED("Merged", 8);

   private String dealStatus;
   private int sequence;
}