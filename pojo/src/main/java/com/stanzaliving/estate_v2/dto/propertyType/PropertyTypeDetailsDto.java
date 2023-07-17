package com.stanzaliving.estate_v2.dto.propertyType;

import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyTypeDetailsDto {
    @EmptyOrNull(message = "name name cannot be empty or null")
    private String name;
    @EmptyOrNull(message = "condition type cannot be empty or null")
    private String condition;
}
