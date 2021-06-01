package com.stanzaliving.estate_v2.dto.propertyType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ModuleDto {
    private String uuid;
    private String name;
    private List<String> roles;
}
