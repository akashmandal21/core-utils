package com.stanzaliving.wanda.dtos;

import java.util.Map;

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
	private String userUuid;
	private String userCode;
	private String userName;
	private String mobile;
	private String email;
	private int currentHostelId;
	private int originalHostelId;
	private String state;
	private boolean isFeaturephoneUser;
	private String userSource;
	private String roomNumber;
	private Map<String,String> userDetails;
}
