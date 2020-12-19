package com.stanzaliving.campaign.dto.request;

import com.stanzaliving.campaign.enums.CampaignType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import java.util.List;


@Data
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UserActiveNudgeRemoveRequestDto {

  @NotEmpty
  List<String> userUuidList;

  CampaignType campaignType;

}
