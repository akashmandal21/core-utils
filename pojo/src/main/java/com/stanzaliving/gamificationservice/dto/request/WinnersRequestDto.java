package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.gamificationservice.enums.ContestTypeEnum;
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
public class WinnersRequestDto {

    @NotBlank(message = "name is Mandatory.")
    private String name;

    @NotBlank(message = "year is Mandatory.")
    private String year;

    @NotBlank(message = "imageUrl is Mandatory.")
    private String imageUrl;

    @NotNull(message = "Points is Mandatory.")
    private int pointsEarned;

    private ContestTypeEnum contestType;
}
