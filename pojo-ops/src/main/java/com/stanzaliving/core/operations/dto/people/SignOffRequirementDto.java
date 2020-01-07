package com.stanzaliving.core.operations.dto.people;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.base.enums.AccessLevel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class SignOffRequirementDto {

	private String userName;

	private String uuid;

	private AccessLevel accesslevel;

	@NotBlank(message = "Role is Mandatory for People Requirement")
	private String roleId;

	private String roleName;

	private int signedOffRequirement;

	private Date date;

}