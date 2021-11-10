package com.stanzaliving.gamificationservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TeamsResponseDto {

    private String teamName;

    private LocalDate dateOfJoining;

    private List<String> users = new ArrayList<>();

    private String location;

    private String zone;

    private String clusterName;

    private String clusterManager;

    private int noOfMembers;
}
