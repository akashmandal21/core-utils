package com.stanzaliving.campaign.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.campaign.enums.CampaignType;
import com.stanzaliving.core.base.StanzaConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UserCampaignStatusRequestDto {
    @NotEmpty private List<String> userUuidIds;
    @NotNull CampaignType campaignType;
    private Boolean optional;
    @NotNull @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = StanzaConstants.IST_TIMEZONE) private Date startDate;
    @NotNull @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = StanzaConstants.IST_TIMEZONE) private Date endDate;
}
