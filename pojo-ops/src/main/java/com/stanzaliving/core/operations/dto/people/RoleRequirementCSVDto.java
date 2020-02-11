package com.stanzaliving.core.operations.dto.people;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class RoleRequirementCSVDto {

    private String uuid;

    private String roleName;

    private String roleId;

    private int available;

    private int required;
}
