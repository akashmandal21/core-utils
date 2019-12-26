package com.stanzaliving.core.operations.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CSVRoleDto {

    private Integer available;
    private Integer required;
}
