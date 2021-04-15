package com.stanzaliving.wanda.dtos;

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

	private String userId;

	private String name;

	private String mobile;

	private String userCode;

	private String email;

	private String profilePictureUrl;

	private String currentRoomNo;
	
	private String originalRoomNo;

	private Boolean featurePhone;

	private String foodPickedAt;
}