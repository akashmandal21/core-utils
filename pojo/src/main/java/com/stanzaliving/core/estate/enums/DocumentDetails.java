package com.stanzaliving.core.estate.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DocumentDetails {

	assetListWithExactCountRetained("assetListWithExactCountRetained","Asset list with exact count retained asset"),
	FIRESYSTEM("fireSystem","Fire System"),
	FIRENOC("fireNOC", "Fire NOC"),
	WARRANTYCARDFORWHITEGOODS("warrantyCardForWhiteGoods", "Warranty Card For White Goods(RO,AC,refrigerator,washing machine etc.)"),
	ELECTRICALLOADSANCTIONLETTER("electricalLoadSanctionLetter","Electrical load sanction letter considering commercial usage"),
	POLLUTIONCONTROLBOARDNOC("pollutionControlBoardNOC","DG - Pollution control board NOC/ Electrical inspector approval if applicable"),
	LIFTLICENSEANDRENEWAL("liftLicenseAndRenewal","Lift license and renewal copy"),
	lastSixMonthsElectricityBills("lastSixMonthsElectricityBills","Last six month's electricity bills"),
	lastSixMonthsWaterBills("lastSixMonthsWaterBills","Last six months’ water bills"),
	utilityBills("utilityBills","All previous months’ utility bills due clearance confirmation"),
	warrantyCardForWaterAccessories("warrantyCardForWaterAccessories","Warranty Card for Heat pumps, geysers, water pumps")
	;
	
	private String attributeName;
	
	private String documentDescription;
}
