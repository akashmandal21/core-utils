package com.stanzaliving.website.request.dto;

import java.util.List;

import com.stanzaliving.core.user.acl.enums.Role;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class UserRoleDto {

    private Role role;
    private List<Role> roles;
    private List<String> micromarketUuids;
}