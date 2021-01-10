package com.stanzaliving.campaign.dto.response;

import com.stanzaliving.campaign.enums.CampaignResponseType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserCampaignResponseDto {

    @NotEmpty String userUuid;

    @NotEmpty String campaignUuid;

    @NotNull CampaignResponseType campaignResponseType;

    Map<String, Object> responseMap;

}
