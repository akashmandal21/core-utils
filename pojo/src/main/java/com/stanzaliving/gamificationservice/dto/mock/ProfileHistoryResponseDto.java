package com.stanzaliving.gamificationservice.dto.mock;

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
public class ProfileHistoryResponseDto {

    @JsonProperty("history_view_all_quick_filter")
    private List<FilterDto> historyViewAllQuickFilterList;

    @JsonProperty("user_contest_subtask_history_view_all")
    private List<HistoryViewAllDto> userContestSubtaskHistoryViewAllList;

}
