package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UsersProfileHistoryFilterValuesResponseDto {

    private List<FilterResponseDto> contestList;

    private List<FilterResponseDto> activityList;

    private String quickFilter;

    private String screen;
}
