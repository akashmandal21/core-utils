package com.stanzaliving.core.oracle.integration.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
public class OracleDepartmentDto {

        String entityId;
        String name;
}
