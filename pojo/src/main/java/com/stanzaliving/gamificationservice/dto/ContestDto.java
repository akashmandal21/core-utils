package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.gamificationservice.enums.ContestStatus;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


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

    private String contestType;

    private String contestTypeId;

    private List<String> location;

    private List<String> zone;

    private List<String> cluster;

    private List<String> pair;

    private ContestStatus contestStatus;

    private String profilePhotoUrl;

    private String durationUnit;

    private boolean recurringContest;

    private String contestMainBackgroundImg;

    private String contestLogo;

    private String myRank;

    private String userPointsStatus;

    private String myPoints;

    private String userRankStatus;

    private String contestMessage;

    private String backGroundPhotoUrl;

}
