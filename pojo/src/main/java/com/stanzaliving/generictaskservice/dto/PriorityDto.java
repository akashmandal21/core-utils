package com.stanzaliving.generictaskservice.dto;

import lombok.*;

/**
 * @author Keshav Singh
 * @date 8/4/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class PriorityDto {
	private String priority;

	private String uuid;

	private int sequence;
}
