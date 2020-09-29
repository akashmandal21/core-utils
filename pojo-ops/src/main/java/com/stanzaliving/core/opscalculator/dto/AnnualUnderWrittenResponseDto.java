package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class AnnualUnderWrittenResponseDto extends AnnualUnderWrittenDto {

    private String underWrittenUuid;

    private String serviceMixUuid;

    private String residenceUuid;

    private UnderWrittenStatus currentStatus;               //get

    private UnderWrittenStatus finalStatus;     //post

    private LocalDate fromDate;

    private LocalDate toDate;

    private Integer roomCount;

    private Integer bedCount;

    private ResidenceBrand residenceBrand;

    private String seasonUuid;

    private String versionName;

    private Integer versionNumber;

    private String commentUuid;

}
