package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserProfileHistoryResponseDto {
    @JsonProperty("month_name")
    private String monthName;
    @JsonProperty("month_data")
    private List<UserActivitiesResponseDto> monthDataList;

}
