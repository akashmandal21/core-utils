package com.stanzaliving.campaign.dto.response;

import com.stanzaliving.campaign.enums.CampaignResponseType;
import com.stanzaliving.campaign.enums.CampaignType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserCampaignResponseDto {

    @NotEmpty String userUuid;

    @NotEmpty String campaignUuid;

    @NotNull CampaignResponseType campaignResponseType;

    Map<String, Object> responseMap;

}
