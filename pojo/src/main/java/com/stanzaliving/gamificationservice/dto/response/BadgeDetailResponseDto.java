package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.gamificationservice.dto.BadgesDataDto;
import com.stanzaliving.gamificationservice.dto.BadgesDetailDto;
import com.stanzaliving.gamificationservice.dto.BadgesListDto;
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
public class BadgeDetailResponseDto {
    @JsonProperty("quick_filter_data")
    private List<FilterResponseDto> filterResponseDtoList;

    @JsonProperty("badges_data")
    private List<BadgesDetailDto> badgesDetailDtoList;

    private List<BadgesDataDto> badgesDataDtos;
    private List<BadgesListDto> badgesListDtos;

}
