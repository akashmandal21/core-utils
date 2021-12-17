package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.gamificationservice.enums.ContestStatus;
import com.stanzaliving.gamificationservice.enums.ContestType;
import com.stanzaliving.gamificationservice.enums.GamificationDurationEnum;
import lombok.*;

import java.time.LocalDate;


/**
 * @author Keshav Singh
 * @date 10/28/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContestDto {

    private String uuid;

    private String description;

    private String contestTitle;

    private String createdBy;

    private int duration;

    private LocalDate startDate;

    private LocalDate endDate;

    private LocalDate dateOfJoining;

    private ContestType contestType;

    private String contestTypeId;

    private String location;

    private String zone;

    private String cluster;

    private String pair;

    private ContestStatus contestStatus;

    private String profilePhotoUrl;

    private GamificationDurationEnum durationUnit;

    private boolean recurringContest;

    private String contestMainBackgroundImg;

    private String contestLogo;

    private String myRank;

    private String userPointsStatus;

    private String myPoints;

    private String userRankStatus;

    private String contestMessage;
}
