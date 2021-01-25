package com.stanzaliving.core.opscalculator.dto.response;

import com.stanzaliving.core.opscalculator.enums.ExistingUnderWrittenAlert;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlertExistingUnderWrittenResponseDto {
    String heading;
    String subHeading;
    UnderWrittenListingResponseDto underWrittenListingResponseDto;
    UnderWrittenStatus underWrittenStatus;
    ExistingUnderWrittenAlert existingUnderWrittenAlert;
}
