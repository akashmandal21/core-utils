package com.stanzaliving.productmix.dto.productmix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductMixDto {

    private ProductMixDetails productMixDetails;

    private RoomAttributeDto roomAttribute;

    private PropertyAttributeDto propertyAttribute;

    public void setPropertyTemplateOptionsDto(PropertyTemplateOptionsDto propertyTemplateOptionsDto) {
        this.propertyAttribute.setPropertyTemplateOptions(propertyTemplateOptionsDto.getPropertyTemplateOptions());
        this.propertyAttribute.setPropertyTemplateOptionsData(propertyTemplateOptionsDto.getPropertyTemplateOptionsData());
    }

    public void setRoomTemplateOptionsDto(RoomTemplateOptionsDto roomTemplateOptionsDto) {
        this.roomAttribute.setRoomTemplateOptions(roomTemplateOptionsDto.getRoomTemplateOptions());
        this.roomAttribute.setRoomTemplateOptionsData(roomTemplateOptionsDto.getRoomTemplateOptionsData());
    }
}
