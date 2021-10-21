package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.dto.propertytemplate.ZonesDto;
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
public class ProductMixDto {

    private ProductMixDetails productMixDetails;

    private LabelValueDto<String> propertyTemplate;

    private List<RoomDetails> roomDetails;

    private List<LabelValueDto<String>> roomTemplateOptions;

    private Map<String, RoomTemplateTypeOptionsData> roomTemplateOptionsData;

    private List<LabelValueDto<String>> propertyTemplateOptions;

    private Map<String, List<ZonesDto>> propertyTemplateOptionsData;

    public void setPropertyTemplateOptionsDto(PropertyTemplateOptionsDto propertyTemplateOptionsDto) {
        propertyTemplateOptions = propertyTemplateOptionsDto.getPropertyTemplateOptions();
        propertyTemplateOptionsData = propertyTemplateOptionsDto.getPropertyTemplateOptionsData();
    }

    public void setRoomTemplateOptionsDto(RoomTemplateOptionsDto roomTemplateOptionsDto) {
        roomTemplateOptions = roomTemplateOptionsDto.getRoomTemplateOptions();
        roomTemplateOptionsData = roomTemplateOptionsDto.getRoomTemplateOptionsData();
    }
}
