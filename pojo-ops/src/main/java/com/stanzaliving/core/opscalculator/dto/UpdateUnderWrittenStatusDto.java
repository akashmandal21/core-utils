package com.stanzaliving.core.opscalculator.dto;

import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateUnderWrittenStatusDto {
    String uuid;
    UnderWrittenStatus underWrittenStatus;
}
