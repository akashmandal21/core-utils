package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.dto.propertytemplate.ZonesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductMixDtoWithValidations {

    @NotNull @Valid
    private ProductMixDetails productMixDetails;

    @NotNull @Valid
    private LabelValueDto<String> propertyTemplate;

    @NotNull @Valid
    private List<RoomDetails> roomDetails;

    @NotNull @Valid
    private List<LabelValueDto<String>> roomTemplateOptions;

    @NotNull @Valid
    private Map<String, RoomTemplateTypeOptionsData> roomTemplateOptionsData;

    @NotNull @Valid
    private List<LabelValueDto<String>> propertyTemplateOptions;

    @NotNull @Valid
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
