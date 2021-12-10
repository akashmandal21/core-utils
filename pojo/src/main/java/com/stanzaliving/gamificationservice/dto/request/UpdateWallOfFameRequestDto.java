package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.gamificationservice.enums.WallOfFameType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateWallOfFameRequestDto {
    @NotNull(
            message = "WallOfFame Id is mandatory to update"
    )
    private String uuid;

    private String contestTitle;

    private String teamMember;

    private WallOfFameType type;

    private int pointsEarned;

    private String clusterName;

    private String description;
}
