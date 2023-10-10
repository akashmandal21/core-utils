package com.stanzaliving.sfr.dto.propertyType;


import com.stanzaliving.sfr.annotation.constraint.EmptyOrNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PropertyTypeRoleDto {
    private String uuid;
    @EmptyOrNull(message = "Role name cannot be empty or null")
    private String name;
    @EmptyOrNull(message = "Role type cannot be empty or null")
    private String type;
    @EmptyOrNull(message = "Role status cannot be empty or null")
    private String status;
}

