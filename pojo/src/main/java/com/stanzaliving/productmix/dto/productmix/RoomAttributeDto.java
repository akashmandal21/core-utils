package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.LabelValueDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomAttributeDto {
    private List<RoomDetails> roomDetails;

    private List<LabelValueDto<String>> roomTemplateOptions;

    private Map<String, RoomTemplateTypeOptionsData> roomTemplateOptionsData;
}
