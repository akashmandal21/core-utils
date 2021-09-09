package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;
import com.stanzaliving.transformations.pojo.ResidenceUIDto;
import java.util.List;
import com.stanzaliving.generictaskservice.dto.ResidenceDto;

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

    private List<String> microMarketUuid;

    private List<String> microMarketNames;

    private List<String> residenceIds;

    private List<ResidenceUIDto> residenceUIDto;

    private List<ResidenceDto> residence;

}
