package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.LabelValueDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductMixDto {

    @NotNull (message = "Product mix details cannot be null")
    private ProductMixDetails productMixDetails;

    private List<LabelValueDto<String>> roomTemplateOptions;

    private List<LabelValueDto<String>> allConsumablesList;

    private List<LabelValueDto<String>> allRoomFeaturesList;

    private RoomAttributeDto roomAttribute;

    private PropertyAttributeDto propertyAttribute;

    public void setPropertyData(PropertyTemplateOptionsDto propertyTemplateOptionsDto) {
        this.propertyAttribute = PropertyAttributeDto
                .builder()
                .propertyTemplateOptions(propertyTemplateOptionsDto.getPropertyTemplateOptions())
                .propertyTemplateOptionsData(propertyTemplateOptionsDto.getPropertyTemplateOptionsData())
                .build();
    }

    public void setRoomsData(RoomTemplateOptionsDto roomTemplateOptionsDto) {
        this.roomTemplateOptions = roomTemplateOptionsDto.getRoomTemplateOptions();
        this.allConsumablesList = roomTemplateOptionsDto.getAllConsumablesList();
        this.allRoomFeaturesList = roomTemplateOptionsDto.getAllRoomFeaturesList();
        this.roomAttribute = RoomAttributeDto
                .builder()
                .roomTemplateOptionsData(roomTemplateOptionsDto.getRoomTemplateOptionsData())
                .roomDetails(Objects.nonNull(roomTemplateOptionsDto.getRoomDetails()) ? roomTemplateOptionsDto.getRoomDetails() : null)
                .build();
    }
}
