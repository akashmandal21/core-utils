package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class WallOfFameResponseDto {
    private String uuid;

    private String contestTitle;

    private String teamMember;

    private String type;

    private int pointsEarned;

    private String clusterName;

    private String description;

    private LocalDate dateOfJoining;

    private String contestLogo;


}
