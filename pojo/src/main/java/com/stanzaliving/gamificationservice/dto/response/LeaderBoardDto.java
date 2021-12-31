package com.stanzaliving.gamificationservice.dto.response;

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
public class LeaderBoardDto {

    private String uuid;

    private String userId;

    private List<String> badgesList = new ArrayList<>();

    private String userImage;

    private String userName;

    private String userCity;

    private String userPoints;

    private String userRank;

    private String userRankStatus;

    private String userCardBgColor;
}
