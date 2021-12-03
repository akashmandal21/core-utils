package com.stanzaliving.wanda.response;

import com.stanzaliving.core.complaint.dto.ComplaintListingDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HomeScreenResponse {

	private boolean showKyc;

	private FoodHomeScreenResponse foodHomeScreenResponse;

	private CommercialsHomeScreenResponse commercialsHomeScreenResponse;

	private ComplaintListingDto complaintListingDto;

	private boolean interestBanner;
}