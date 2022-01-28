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
public class ProfileHistoryViewAllResponseDto {

    @JsonProperty("history_view_all_quick_filter")
    private List<FilterResponseDto> filterResponseDtoList;

    @JsonProperty("user_contest_subtask_history_view_all")
    private List<MonthDataResponseDto> userContestSubTaskHistoryList;
}
