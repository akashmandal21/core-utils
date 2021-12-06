package com.stanzaliving.housekeepingservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.generictaskservice.dto.ResidenceDto;
import com.stanzaliving.housekeepingservice.enums.HkBeatPlanStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Vikas S T
 * @date 13-Nov-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MyApprovalBeatPlanResponseDto extends AbstractDto {
    private String microClusterName;
    private List<ResidenceDto> residences;
    private LocalDate startDate;
    private LocalDate endDate;
    private String cityUuid;
    private String cityName;
    private boolean draft;
    private String microMarketName;
    private String microMarketUuid;
    private HkBeatPlanStatus hkBeatPlanStatus;
}
