package com.stanzaliving.gamificationservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class WallOfFameResponseDto {
    private String uuid;

    private String contestTitle;

    private String teamMember;

    private String type;

    private int pointsEarned;

    private String clusterName;

    private String description;

}
