package com.stanzaliving.wanda.response;

import com.stanzaliving.complaint.dto.ComplaintMetaDataDto;

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
	
	private ComplaintMetaDataDto complaintMetaDataDto;
}