package com.stanzaliving.gamificationservice.dto.response;

import com.stanzaliving.gamificationservice.dto.BadgesDto;
import com.stanzaliving.gamificationservice.dto.ContestDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RewardsResponseDto {
    private String uuid;

    private String name;

    private String employeeCode;

    private String emailId;

    private String location;

    private int bonusPoints;

    private int pointsScored;

    private List<BadgesDto> badgesDtoList;

    private List<ContestDto> contestDtoList;
}
