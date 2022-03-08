package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddUserAndRoleDto {

    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String isoCode;
    private AccessLevel accessLevel;
    private List<String> accessLevelEntityUuids;
    private List<String> roleUuids;
    private String userUuid;
}
