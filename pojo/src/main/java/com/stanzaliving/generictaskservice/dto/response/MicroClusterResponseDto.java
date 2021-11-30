package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.generictaskservice.dto.ResidenceDto;
import com.stanzaliving.transformations.pojo.ResidenceUIDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MicroClusterResponseDto extends AbstractDto {

    private String uuid;

    private String microClusterName;

    private String cityUuid;

    private String cityName;

    private String microMarketUuid;

    private String microMarketName;

    private List<String> residenceIds;

    private List<ResidenceUIDto> residenceUIDto;

    private List<ResidenceDto> residences;

    private boolean microClusterStatus;

}
