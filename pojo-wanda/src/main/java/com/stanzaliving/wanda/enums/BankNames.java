package com.stanzaliving.wanda.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BankNames {
	
	
	AXIS_BANK("Axis Bank"),
	BANDHAN_BANK("Bandhan Bank"),
	BANK_OF_BARODA("Bank of Baroda"),
	BANK_OF_INDIA("Bank of India"),
	BANK_OF_MAHARASHTRA("Bank of Maharashtra"),
	CSB_BANK("CSB Bank"),
	CANARA_BANK("Canara Bank"),
	CENTRAL_BANK_OF_INDIA("Central Bank of India"),
	CITY_UNION_BANK("City Union Bank"),
	DCB_BANK("DCB Bank"),
	DHANLAXMI_BANK("Dhanlaxmi Bank"),
	FEDERAL_BANK("Federal Bank"),
	HDFC_BANK("HDFC Bank"),
	ICICI_BANK("ICICI Bank"),
	IDBI_BANK("IDBI Bank"),
	IDFC_FIRST_BANK("IDFC FIRST Bank"),
	INDIAN_BANK("Indian Bank"),
	INDIAN_OVERSEAS_BANK("Indian Overseas Bank"),
	INDUSIND_BANK("IndusInd Bank"),
	JAMMU__KASHMIR_BANK("Jammu & Kashmir Bank"),
	KARNATAKA_BANK("Karnataka Bank"),
	KARUR_VYSYA_BANK("Karur Vysya Bank"),
	KOTAK_MAHINDRA_BANK("Kotak Mahindra Bank"),
	LAKSHMI_VILAS_BANK("Lakshmi Vilas Bank"),
	NAINITAL_BANK("Nainital bank"),
	PUNJAB_NATIONAL_BANK("Punjab National Bank"),
	PUNJAB_AND_SIND_BANK("Punjab and Sind Bank"),
	RBL_BANK("RBL Bank"),
	SOUTH_INDIAN_BANK("South Indian Bank"),
	STATE_BANK_OF_INDIA("State Bank of India"),
	TAMILNAD_MERCANTILE_BANK("Tamilnad Mercantile Bank"),
	UCO_BANK("UCO Bank"),
	UNION_BANK_OF_INDIA("Union Bank of India"),
	YES_BANK("YES Bank");
	
	private String bank;
	
	private static List<EnumListing<BankNames>> bankListings= new ArrayList<>();

	static {
		for (BankNames baneName : BankNames.values()) {
			bankListings.add(EnumListing.of(baneName, baneName.getBank()));
		}
	}
	
	public static List<EnumListing<BankNames>> getBankListings() {
		return bankListings;
	}


}
