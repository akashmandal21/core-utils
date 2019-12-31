package com.stanzaliving.core.estate.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DocumentDetails {

	UTILITYBILLS("utilityBills","Asset list with exact count retained asset"),
	FIRESYSTEM("fireSystem","Fire System"),
	FIRENOC("fireNOC", "Fire NOC"),
	WARRANTYCARDFORWHITEGOODS("warrantyCardForWhiteGoods", "Warranty Card For White Goods(RO,AC,refrigerator,washing machine etc.)"),
	ELECTRICALLOADSANCTIONLETTER("electricalLoadSanctionLetter","Electrical load sanction letter considering commercial usage"),
	POLLUTIONCONTROLBOARDNOC("pollutionControlBoardNOC","DG - Pollution control board NOC/ Electrical inspector approval if applicable");
	
	private String attributeName;
	
	private String documentDescription;
}
