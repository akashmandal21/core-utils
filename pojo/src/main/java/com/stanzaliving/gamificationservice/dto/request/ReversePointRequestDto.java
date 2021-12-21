package com.stanzaliving.gamificationservice.dto.request;

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
public class ReversePointRequestDto {

	private String contestUuid;

	private int reversePoints;

	private String fromPersonUuid;

	private String toPersonUuid;

	private String activityUuid;

	private String description;
}
