package com.stanzaliving.core.facerecognition.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString
@NoArgsConstructor
@SuperBuilder
public class FrResponseDto {

	private String userId;

}