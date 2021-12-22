package com.stanzaliving.gamificationservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class ClusterTeamNameResponseDto {

    private String uuid;

    private String teamName;

    private List<String> memberNames;

}
