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
public class OnGoingContestResponseDto {

    @JsonProperty("history_view_all_quick_filter")
    private List<FilterDto> historyViewAllQuickFilter;

    @JsonProperty("ongoing_contest_list")
    private List<OnGoingContestListDto> onGoingContestList;

    @JsonProperty("past_contest_list")
    private List<PastContestListDto> pastContestList;

}
