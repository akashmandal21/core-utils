package com.stanzaliving.core.operations.dto;

import com.stanzaliving.core.user.acl.enums.AccessLevel;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;

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
