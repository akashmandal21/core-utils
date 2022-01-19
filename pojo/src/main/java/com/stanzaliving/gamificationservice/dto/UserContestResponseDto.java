package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.gamificationservice.dto.request.RewardsRequestDto;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Keshav Singh
 * @date 11/25/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserContestResponseDto {

    private String contestLogo;

    private String description;

    private int duration;

    private LocalDate startDate;

    private LocalDate endDate;

    private Map<String,Integer> reward;

    private Map<String,List<BadgesDto>> badgesDtoList;

    private List<UsersProfileDto> usersProfileDtoList;
}
