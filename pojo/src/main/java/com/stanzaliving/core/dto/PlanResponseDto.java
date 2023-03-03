package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.residenceservice.enums.PlanTypeEnum;
import com.stanzaliving.residenceservice.enums.VasCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanResponseDto {

    private String planUuid;

    private VasCategory category;

    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_FORMAT, timezone = StanzaConstants.IST_TIMEZONE)
    private Date planStartDate;

    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_FORMAT, timezone = StanzaConstants.IST_TIMEZONE)
    private Date planEndDate;

    private String serviceMixUuid;

    private String planType;

}
