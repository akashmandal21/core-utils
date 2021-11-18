package com.stanzaliving.gamificationservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class ClusterDetailsDto {

    private String clustername;

    private String clusterManagerName;

    private int clusterMemberCount;

}
