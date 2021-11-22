package com.stanzaliving.productmix.dto.roomtemplate.consumables;

import com.stanzaliving.productmix.dto.LabelValueDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumableFiltersDto {
    private Set<LabelValueDto<String>> categories;

    private String uniqueKey;
}
