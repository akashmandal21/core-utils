package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserMigrationDto {

	private Integer userId;
	private String userCode;
	private String userName;
	private String mobile;
	private String email;
	private int currentHostelId;
	private String originalHostelId;
	private String state;
	private boolean isFeaturephoneUser;
	private String userSource;
}
