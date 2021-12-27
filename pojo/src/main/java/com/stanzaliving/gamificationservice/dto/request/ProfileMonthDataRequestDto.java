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
public class ProfileMonthDataRequestDto {
    @NotBlank(message = "MonthName is Mandatory.")
    private String monthName;

    private String imageUrl;

    private String title;

    private String subTitle;

    private String points;

    private String time;
}
