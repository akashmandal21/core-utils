package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.dto.roomtemplate.ConsumablesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomTemplateTypeOptionsData {

    private List<LabelValueDto<String>> roomFeatures;

    private List<ConsumablesDto> consumables;
}
