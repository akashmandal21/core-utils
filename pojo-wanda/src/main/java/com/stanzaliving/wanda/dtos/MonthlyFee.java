package com.stanzaliving.wanda.dtos;

import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@ToString
public class MonthlyFee {

	private String monthlyFeeStr;

	private String packedServicesFeeStr;
	private String foodServicesFeeStr;
	private Double monthlyFee;

	private Double packedServicesFee;
	@Builder.Default
	private Double foodServicesFee=0.0d;

	private String total;
	
	private String totalWithoutVAS;

	private List<Pair<String, String>> vasFees;

	private String maintenanceFee;

	private Double onmRentalCharges;

	private Double onmServiceCharges;

	private Double onmGstValue;

	private Double onmGstPercentage;

	private Double onmTotal;
}
