package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OngoingContestDetailsResponseDto {

    @JsonProperty("contestDesc")
    private String description;
    @JsonProperty("contestStartDate")
    private LocalDate startDate;
    @JsonProperty("contestEndDate")
    private LocalDate endDate;
    @JsonProperty("contestReward")
    private List<OngoingContestRewardResponseDto> contestRewards;
    @JsonProperty("contestBadges")
    private List<OngoingContestBadgeResponseDto> contestBadges;

}
