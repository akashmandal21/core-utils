package com.stanzaliving.gamificationservice.dto;

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
public class ReversePointDto {

	private String uuid;

	private int reversePoints;

	private String fromPerson;

	private String toPerson;

	private String activity;

	private String description;
}
