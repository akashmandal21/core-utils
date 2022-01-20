package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Prince P V
 * @date 01/13/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UsersProfileHistoryFilterDto {

    private List<String> contestNameList;

    private List<String> contestUuidList;

    private List<String> activityList;

    private List<String> activityUuidList;

    private int duration;

    private LocalDate startDate;

    private LocalDate endDate;

    private String userId;

}
