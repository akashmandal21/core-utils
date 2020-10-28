package com.stanzaliving.campaign.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.core.base.StanzaConstants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferDto {

	
	@NotNull(message = "Number of Coupon is mandatory")
	Integer numberOfCoupons;
	
	@NotNull(message = "Offer Name is mandatory")
    String  offerName;
	
	@NotNull(message = "Validity Date is mandatory")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = StanzaConstants.IST_TIMEZONE)
	Date validityDate;
	
}
