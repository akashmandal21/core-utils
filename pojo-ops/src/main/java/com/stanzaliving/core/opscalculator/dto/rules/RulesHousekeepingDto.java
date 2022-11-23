package com.stanzaliving.core.opscalculator.dto.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class RulesHousekeepingDto {

    private String residenceUuid;

    private int baseBedOccupancy;

    private int baseCount;

    private int actualCount;

}
