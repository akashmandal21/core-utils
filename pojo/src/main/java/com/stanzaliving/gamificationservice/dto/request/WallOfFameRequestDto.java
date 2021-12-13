package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.gamificationservice.enums.WallOfFameType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;


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

    private int pointsEarned;

    private String clusterName;

    private String description;

}
