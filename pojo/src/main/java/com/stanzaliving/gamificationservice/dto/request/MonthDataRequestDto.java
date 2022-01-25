package com.stanzaliving.gamificationservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MonthDataRequestDto {
    @NotBlank(message = "MonthName is Mandatory.")
    private String monthName;

    private String imageUrl;

    @NotBlank(message = "Title is Mandatory.")
    private String title;

    private String subTitle;

    private String points;

    private String time;

    @NotBlank(message = "ContestId is Mandatory.")
    private String contestUuid;
}
