package com.stanzaliving.estate_v2.dto.propertyType;


import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import com.stanzaliving.estate_v2.annotation.operation.PostGroup;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoleDto {
    private String uuid;
    @EmptyOrNull(message = "Role name cannot be empty or null", groups = PostGroup.class)
    private String name;
    @EmptyOrNull(message = "Role type cannot be empty or null", groups =PostGroup.class)
    private String type;
    @EmptyOrNull(message = "Role status cannot be empty or null", groups =PostGroup.class)
    private String status;
}

