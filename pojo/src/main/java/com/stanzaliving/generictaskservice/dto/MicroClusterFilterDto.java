package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.generictaskservice.enums.MicroClusterSortSpecs;
import com.stanzaliving.generictaskservice.enums.SortDirection;
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

    protected String cityName;

    protected String cityUuid;

    protected Boolean microClusterStatus;

    protected List<String> residenceIds;

    protected String microMarketUuid;

    protected String microMarketName;

    private PaginationRequest pageRequest;

    private MicroClusterSortSpecs sortSpecs;

    private SortDirection sortDirection;

}
