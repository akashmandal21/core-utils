package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.dto.propertytemplate.ZonesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyAttribute {



    private List<ZonesDto> zones;
}
