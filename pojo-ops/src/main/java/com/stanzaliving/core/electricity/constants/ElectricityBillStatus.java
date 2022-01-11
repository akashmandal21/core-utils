/**
 * 
 */
package com.stanzaliving.core.electricity.constants;
import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author manish.pareek
 *
 * @date 08-OCT-2021
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ElectricityBillStatus {
	DRAFT("Draft", 3), 
	SUBMITTED("Submitted", 2), 
	CANCELLED("Cancelled", 4), 
	APPROVED("Approved", 1),
	REJECTED("Rejected", 5);

   private String billStatus;
   private int sequence;
   
   private static List<EnumListing<ElectricityBillStatus>> electricityBillStatusList = new ArrayList<>();
   private static List<EnumListing<ElectricityBillStatus>> electricityBillStatusForApprovalDashBoard = new ArrayList<>();
   static {
       for(ElectricityBillStatus electricityBillStatus: ElectricityBillStatus.values()){
    	   electricityBillStatusList.add(EnumListing.of(electricityBillStatus, electricityBillStatus.getBillStatus()));
       }
   }

   public static  List<EnumListing<ElectricityBillStatus>> getElectricityBillStatus(){
       return electricityBillStatusList;
   }
   
	public static List<EnumListing<ElectricityBillStatus>> getElectricityBillStatusForApprovalDashBoard() {
		electricityBillStatusForApprovalDashBoard.add(EnumListing.of(ElectricityBillStatus.APPROVED, ElectricityBillStatus.APPROVED.getBillStatus()));
		electricityBillStatusForApprovalDashBoard.add(EnumListing.of(ElectricityBillStatus.SUBMITTED, ElectricityBillStatus.SUBMITTED.getBillStatus()));
		return electricityBillStatusForApprovalDashBoard;
	}

}