package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
//should not be used, used for now as already developed on Fe
public class CostGraphFeElementDto {
    String title;
    FeElementDto value;
}
