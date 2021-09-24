package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;
import lombok.experimental.SuperBuilder;
import com.stanzaliving.generictaskservice.enums.*;
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

    protected String cityName;

    protected Boolean microClusterStatus;

    protected List<String> residenceIds;

    protected List<String> microMarketUuids;

    private PaginationRequest pageRequest;

    private MicroClusterSortSpecs sortSpecs;

    private SortDirection sortDirection;

}
