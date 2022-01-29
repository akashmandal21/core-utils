package com.stanzaliving.gamificationservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMonthDataRequestDto {
    @NotNull(
            message = "MonthData Id is mandatory to update"
    )
    private String uuid;

    private String monthName;

    private String imageUrl;

    private String title;

    private String subTitle;

    private String points;

    private String time;

    private String userProfileUuid;

}
