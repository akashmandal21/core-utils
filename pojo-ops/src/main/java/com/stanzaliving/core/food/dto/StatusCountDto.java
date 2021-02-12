package com.stanzaliving.core.food.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class StatusCountDto {
	private String status;
	private Integer count;
}
