package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MonthDataResponseDto {
    @JsonProperty("month_name")
    private String monthName;
    @JsonProperty("month_data")
    List<MonthDataResponseDto> profileMonthDataRespDtoList;
    private String uuid;
    private String image;
    private String title;
    private String subTitle;
    private String points;
    private String time;
    private String userProfileUuid;


}
