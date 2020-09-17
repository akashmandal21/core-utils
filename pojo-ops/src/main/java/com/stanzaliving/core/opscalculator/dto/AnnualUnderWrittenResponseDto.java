package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AnnualUnderWrittenResponseDto extends AnnualUnderWrittenDto {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String underWrittenUuid;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String serviceMixUuid;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String residenceUuid;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String currentStatus;               //get

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private UnderWrittenStatus finalStatus;     //post

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private LocalDate fromDate;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private LocalDate toDate;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer roomCount;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer bedCount;
}
