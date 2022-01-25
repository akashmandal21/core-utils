package com.stanzaliving.gamificationservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserActivitiesResponseDto {
    private String image;

    private String title;

    private String subTitle;

    private String points;

    private String time;

}
