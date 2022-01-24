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

    private Map<String, String> contestList;

    private Map<String, String> activityList;

    private String quickFilter;

    private String screen;
}
