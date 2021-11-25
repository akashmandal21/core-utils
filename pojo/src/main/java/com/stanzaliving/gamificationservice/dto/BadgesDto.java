package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Keshav Singh
 * @date 11/24/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BadgesDto {

	private String uuid;

	private String badgesName;

	private String description;

	private String type;

	private int points;

	private String badgeType;

	private List<String> contests = new ArrayList<>();

	private String profilePhotoUrl;


}
