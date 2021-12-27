package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.gamificationservice.dto.BadgesDto;
import com.stanzaliving.gamificationservice.dto.ContestDto;
import com.stanzaliving.gamificationservice.dto.UsersProfileDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.time.LocalTime;
import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProfileMonthDataResponseDto {
    private String uuid;

    @JsonProperty("month_name")
    private String monthName;

    private String image;

    private String title;

    private String subTitle;

    private String points;

    private String time;

    @JsonProperty("month_data")
    List<ProfileMonthDataResponseDto> profileMonthDataRespDtoList;
}
