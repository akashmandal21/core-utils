package com.stanzaliving.core.operations.dto;

import javax.validation.constraints.NotBlank;

import lombok.AccessLevel;
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

    private String date;



}
