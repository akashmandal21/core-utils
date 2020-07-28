package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FeaturephoneUserDto {

	private Integer userId;

	private String name;

	private String mobile;

	private String userCode;

	private String email;

	private String profilePictureUrl;
	
	private String room;

	private String foodPickedAt;
}
