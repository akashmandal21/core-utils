package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.gamificationservice.enums.WallOfFameType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class WallOfFameRequestDto {
    @NotBlank(message = "Contest Title is Mandatory.")
    private String contestTitle;

    @NotBlank(message = "Team Member is Mandatory.")
    private String teamMember;

    private WallOfFameType type;

    @NotNull(message = "PointsEarned is Mandatory.")
    private int pointsEarned;

    @NotBlank(message = "ClusterName is Mandatory.")
    private String clusterName;

    private String description;

    @NotBlank(message = "Year is Mandatory.")
    private String year;

}
