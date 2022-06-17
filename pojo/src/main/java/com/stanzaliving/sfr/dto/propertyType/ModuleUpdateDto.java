package com.stanzaliving.sfr.dto.propertyType;

import com.stanzaliving.sfr.enumeration.ModuleNames;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModuleUpdateDto {

    private String propertyUuid;
    private ModuleNames moduleName;
}
