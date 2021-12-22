package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Keshav Singh
 * @date 12/17/2021
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ReversePointResponseDto {

	private String uuid;

	private String contestUuid;

	private String contestName;

	private int reversePoints;

	private String fromPerson;

	private String fromPersonUuid;

	private String toPerson;

	private String toPersonUuid;

	private String activity;

	private String activityUuid;

	private String description;
}
