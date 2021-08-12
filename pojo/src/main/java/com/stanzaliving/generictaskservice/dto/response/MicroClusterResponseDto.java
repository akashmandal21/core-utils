package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
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

    private List<String> microMarkets;

    private List<String> residenceIds;

    private String stateUuid;

    private String cityUuid;
}
