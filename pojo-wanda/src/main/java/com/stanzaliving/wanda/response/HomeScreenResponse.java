package com.stanzaliving.wanda.response;

import com.stanzaliving.core.complaint.dto.ComplaintListingDtoV1;

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

	private ComplaintListingDtoV1 complaintListingDtoV1;

	private boolean interestBanner;
}