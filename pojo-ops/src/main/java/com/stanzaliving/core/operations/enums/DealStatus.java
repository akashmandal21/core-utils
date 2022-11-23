/**
 * 
 */
package com.stanzaliving.core.operations.enums;
import java.util.ArrayList;
import java.util.List;

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
   private static List<DealStatus> dashboardDealStatusWithExpiredDealStatus = new ArrayList<>();
   
   private static List<DealStatus> dashboardDealStatusList = new ArrayList<>();
   
	static {

		dashboardDealStatusWithExpiredDealStatus.add(DealStatus.APPROVED);
		dashboardDealStatusWithExpiredDealStatus.add(DealStatus.CANCELLED);
		dashboardDealStatusWithExpiredDealStatus.add(DealStatus.EXPIRED);
		dashboardDealStatusWithExpiredDealStatus.add(DealStatus.ON_HOLD);
		dashboardDealStatusWithExpiredDealStatus.add(DealStatus.REJECTED);
		dashboardDealStatusWithExpiredDealStatus.add(DealStatus.UNDER_DRAFT);
		dashboardDealStatusWithExpiredDealStatus.add(DealStatus.SUBMITTED);
	}

	public static List<DealStatus> getDashboardDealStatusWithExpiredDealStatus() {
		return dashboardDealStatusWithExpiredDealStatus;
	}

	static {

		dashboardDealStatusList.add(DealStatus.APPROVED);
		dashboardDealStatusList.add(DealStatus.UNDER_DRAFT);
		dashboardDealStatusList.add(DealStatus.SUBMITTED);
	}

	public static List<DealStatus> getDashboardDealStatus() {
		return dashboardDealStatusList;
	}

}