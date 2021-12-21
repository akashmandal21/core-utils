package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Keshav Singh
 * @date 12/16/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LeaderBoardDto {

	private String uuid;

	private String rank;

	private String rankStatus;

	private int overallScoreInPercentage;

	private String userProfileImage;

	private String userName;

	private String userCity;

	private int userPoints;

	private String userCardBgColor;

	private List<BadgesDto> badges;

	private List<String> badgesuuid;

}
