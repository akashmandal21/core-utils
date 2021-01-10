package com.stanzaliving.core.opscalculator.dto.response;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceBasicInfoResponseDto {

    private String residenceUuid;

    private Integer roomCount;

    private Integer bedCount;

    private ResidenceBrand residenceBrand;

}
