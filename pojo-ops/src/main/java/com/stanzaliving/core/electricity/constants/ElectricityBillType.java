package com.stanzaliving.core.electricity.constants;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum ElectricityBillType {

	MAIN("Main"), 
	COMMON_AREA("Common area"), 
	ROOM("Room"),
	DG_CHARGES("DG_Charges"),
	MAINTENANCE_CHARGES("Maintenance Charges");

    private String billTypeName;

    private static List<EnumListing<ElectricityBillType>> electricityBillTypes = new ArrayList<>();
    static {
        for(ElectricityBillType electricityBillType: ElectricityBillType.values()){
        	electricityBillTypes.add(EnumListing.of(electricityBillType, electricityBillType.getBillTypeName()));
        }
    }

    public static  List<EnumListing<ElectricityBillType>> getElectricityBillTypes(){
        return electricityBillTypes;
    }
}
