package com.stanzaliving.website.request.dto;

import java.util.List;

import com.stanzaliving.core.user.acl.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author raj.kumar
 *
 */
@Data
@SuperBuilder  // all inherited class of this class needs to use @SuperBuilder rather than @Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleDto {

    private Role role;
    private List<Role> roles;
    private List<String> micromarketUuids;
}