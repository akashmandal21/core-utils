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

    private RoomAttributeDto roomAttribute;

    private PropertyAttributeDto propertyAttribute;

    public void setPropertyTemplateOptionsDto(PropertyTemplateOptionsDto propertyTemplateOptionsDto) {
        propertyAttribute.setPropertyTemplateOptions(propertyTemplateOptionsDto.getPropertyTemplateOptions());
        propertyAttribute.setPropertyTemplateOptionsData(propertyTemplateOptionsDto.getPropertyTemplateOptionsData());
    }

    public void setRoomTemplateOptionsDto(RoomTemplateOptionsDto roomTemplateOptionsDto) {
        roomAttribute.setRoomTemplateOptions(roomTemplateOptionsDto.getRoomTemplateOptions());
        roomAttribute.setRoomTemplateOptionsData(roomTemplateOptionsDto.getRoomTemplateOptionsData());
    }
}
