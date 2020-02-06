package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.GraphDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class CostEfficiencyGraphDto extends GraphDto {
    List<CostGraphFeElementDto> extraInformation;
}
