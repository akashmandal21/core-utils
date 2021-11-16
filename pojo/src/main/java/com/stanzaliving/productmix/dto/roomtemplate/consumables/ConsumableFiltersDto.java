package com.stanzaliving.productmix.dto.roomtemplate.consumables;

import com.stanzaliving.productmix.dto.LabelValueDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumableFiltersDto {
    private List<LabelValueDto<String>> categories;

    private String uniqueKey;
}
