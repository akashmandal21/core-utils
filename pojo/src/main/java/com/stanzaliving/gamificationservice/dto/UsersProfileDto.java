package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

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
public class UsersProfileDto {

    private String uuid;

    private String userId;

    private List<String> activeContestList = new ArrayList<>();

    private List<String> badgesList = new ArrayList<>();

    private String userImage;

    private boolean userStatus;

    private String userName;

    private String greetingMsg;

    private String userCity;

    private String userPoints;

    private String userPointsStatus;

    private String userRank;

    private String userRankStatus;

    private int noOfContestShow;

}
