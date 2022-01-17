package com.stanzaliving.estate_v2.dto.propertyType;

import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ModuleDto {
    @EmptyOrNull(message = "module uuid cannot be empty or null")
    private String uuid;
    @EmptyOrNull(message = "module name cannot be empty or null")
    private String name;
    @Size(min = 1,message = "roles cannot be less than 1")
    private List<String> roles;
}
