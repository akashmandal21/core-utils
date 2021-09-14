package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class MicroClusterFilterDto {

    protected String microClusterUuid;

    protected String microClusterName;

    protected String cityUuid;

    protected List<String> residenceIds;

    protected List<String> microMarketUuid;

    private PaginationRequest pageRequest;
}
