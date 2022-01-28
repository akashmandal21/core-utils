package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserBadgesResponseDto {

    @JsonProperty("badge_score")
    private String badgeScore;

    @JsonProperty("badge_name")
    private String badgeName;

    @JsonProperty("badgeImage")
    private String badgeImage;

}
