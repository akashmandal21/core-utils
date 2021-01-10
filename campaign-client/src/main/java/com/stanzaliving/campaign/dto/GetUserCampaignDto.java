package com.stanzaliving.campaign.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetUserCampaignDto {

	private List<String> userUuidIds;

	private String campaignType;

	private Boolean optional;

	private Date startDate;

	private Date endDate;

}
