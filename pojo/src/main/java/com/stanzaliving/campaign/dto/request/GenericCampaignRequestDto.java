package com.stanzaliving.campaign.dto.request;

import com.stanzaliving.campaign.dto.CampaignDto;
import com.stanzaliving.core.enums.ResidenceUserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GenericCampaignRequestDto extends CampaignDto {

    @Builder.Default
    boolean optional = true;

    ResidenceUserType residenceUserType;

    List<String> userUuidList;

}
