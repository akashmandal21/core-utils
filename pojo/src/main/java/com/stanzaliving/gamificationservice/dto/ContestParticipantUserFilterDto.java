package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContestParticipantUserFilterDto {

    private String contestUuid;

    // Can take values "OVERALL","CLUSTER"
    private String filterName;

    private String clusterUuid;

    private List<String> locations;

    private List<String> zones;

    private List<String> clusters;

}
