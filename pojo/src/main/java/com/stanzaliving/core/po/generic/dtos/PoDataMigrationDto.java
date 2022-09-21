package com.stanzaliving.core.po.generic.dtos;


import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PoDataMigrationDto {
    private String poUuid;
    private String poCreatedBy;
    private String poExpenseType;
}
