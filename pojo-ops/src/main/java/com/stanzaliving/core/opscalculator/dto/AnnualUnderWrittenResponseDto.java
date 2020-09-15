package com.stanzaliving.core.opscalculator.dto;

import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AnnualUnderWrittenResponseDto extends AnnualUnderWrittenDto {
    private String underWrittenUuid;
    private String serviceMixUuid;
    private String residenceUuid;
    private String currentStatus;               //get
    private UnderWrittenStatus finalStatus;     //post

    private int roomCount;
    private int bedCount;
}
