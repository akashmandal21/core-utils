package com.stanzaliving.gamificationservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class ClusterDetailsDto {

    private String uuid;

    private String clusterName;

    private String clusterManagerName;

    private int clusterMemberCount;

    private List<String> clusterMemberNames;

    private String teams;

}
