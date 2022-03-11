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
	IDBI_BANK("IDBI"),
	IDFC_FIRST_BANK("IDFC FIRST Bank"),
	INDIAN_BANK("Indian Bank"),
	INDIAN_OVERSEAS_BANK("Indian Overseas Bank"),
	INDUSIND_BANK("Indusind Bank"),
	JAMMU__KASHMIR_BANK("Jammu and Kashmir Bank"),
	KARNATAKA_BANK("Karnataka Bank"),
	KARUR_VYSYA_BANK("Karur Vysya Bank"),
	KOTAK_MAHINDRA_BANK("Kotak Mahindra Bank"),
	LAKSHMI_VILAS_BANK("Lakshmi Vilas Bank"),
	NAINITAL_BANK("Nainital bank"),
	PUNJAB_NATIONAL_BANK("Punjab National Bank"),
	PUNJAB_AND_SIND_BANK("Punjab & Sind Bank"),
	RBL_BANK("RBL Bank"),
	SOUTH_INDIAN_BANK("South Indian Bank"),
	STATE_BANK_OF_INDIA("State Bank of India"),
	TAMILNAD_MERCANTILE_BANK("Tamilnad Mercantile Bank"),
	UCO_BANK("UCO Bank"),
	UNION_BANK_OF_INDIA("Union Bank of India"),
	YES_BANK("Yes Bank"),
	STATE_BANK_OF_HYDERABAD("State Bank of Hyderabad"),
	AIRTEL_PAYMENTS_BANK("Airtel Payments Bank"),
	ALLAHABAD_BANK("Allahabad Bank"),
	ANDHRA_BANK("Andhra Bank"),
	AU_SMALL_FINANCE_BANK("AU Small Finance Bank"),
	VARACHHA_BANK("Varachha Co-operative Bank"),
	UNITED_BANK_OF_INDIA("United Bank of India"),
	TN_APEX_BANK("Tamilnadu State Apex Co-operative Bank"),
	TN_MERCANTILE_BANK("Tamilnadu Mercantile Bank"),
	THANE_JANATA_SAHAKARI_BANK("Thane Janata Sahakari Bank"),
	SYNDICATE_BANK("Syndicate Bank"),
	SVCB_BANK("Shamrao Vithal Co-operative Bank"),
	SURY_BANK("Suryoday Small Finance Bank"),
	STATE_BANK_OF_PATIALA("State Bank of Patiala"),
	SRCB_BANK("Saraswat Co-operative Bank"),
	SC_BANK("Standard Chartered Bank"),
	STATE_BANK_OF_TRAVANCORE("State Bank of Travancore"),
	STATE_BANK_OF_MYSORE("State Bank of Mysore"),
	STATE_BANK_OF_BIKANER_AND_JAIPUR("State Bank of Bikaner and Jaipur"),
	PMC_BANK("Punjab & Maharashtra Co-operative Bank"),
	BHARAT_COOPERATIVE_BANK("Bharat Co-Operative Bank"),
	DENA_BANK("Dena Bank"),
	CORPORATION_BANK("Corporation Bank"),
	COSMOS_COOPERATIVE_BANK("Cosmos Co-operative Bank"),
	CATHOLIC_SYRIAN_BANK("Catholic Syrian Bank"),
	DEVELOPMENT_BANK_OF_SINGAPORE("Development Bank of Singapore"),
	DEUTSCHE_BANK("Deutsche Bank"),
	ESAF_SMALL_FINANCE_BANK("ESAF Small Finance Bank"),
	EQUITAS_SMALL_FINANCE_BANK("Equitas Small Finance Bank"),
	FINCARE_SMALL_FINANCE_BANK("Fincare Small Finance Bank"),
	HSBC_BANK("Hongkong & Shanghai Banking Corporation"),
	PUNE_JANATA_SAHAKARI_BANK("Janata Sahakari Bank (Pune)"),
	JANA_SMALL_FINANCE_BANK("Jana Small Finance Bank"),
	KCCB_BANK("Kalupur Commercial Co-operative Bank"),
	KALYAN_JANATA_SAHAKARI_BANK("Kalyan Janata Sahakari Bank"),
	MEHSANA_URBAN_BANK("Mehsana Urban Co-operative Bank"),
	NE_SMALL_FINANCE_BANK("North East Small Finance Bank"),
	NKGSB("NKGSB Co-operative Bank"),
	NSDL_PAYMENTS_BANK("NSDL Payments Bank"),
	ORIENTAL_BANK_OF_COMMERCE("Oriental Bank of Commerce"),
	PAYTM_PAYMENTS_BANK("Paytm Payments Bank");

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
