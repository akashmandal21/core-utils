package com.stanzaliving.campaign.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetUserCampaignNewDto {

  private String userId;

  private String campaignType;

  private Boolean optional;

  private Date startDate;

  private Date endDate;

}
