package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Prince P V
 * @date 01/13/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OnGoingContestFilterDto {
    // Can take values "OVERALL","PAST","CLUSTER"
    private String filterName;

    private boolean includePastContests = false;

    private String clusterUuid;

    private String userUuid;

    private List<String> locations;

    private List<String> zones;

    private List<String> clusters;

}
