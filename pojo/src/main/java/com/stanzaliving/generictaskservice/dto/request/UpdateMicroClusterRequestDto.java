package com.stanzaliving.generictaskservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMicroClusterRequestDto {
    @NotNull(
            message = "MicroCluster Id is mandatory to update microcluster"
    )
    private String uuid;

    private String microClusterName;

    private List<String> residenceIds;

    private String cityUuid;

    private boolean microClusterStatus;

    private List<String> microMarketNames;


}
