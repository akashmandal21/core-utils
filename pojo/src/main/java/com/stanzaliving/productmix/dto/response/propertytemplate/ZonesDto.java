package com.stanzaliving.productmix.dto.response.propertytemplate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZonesDto {

    private String uuid;

    private String label;

    private Boolean enabled;

    private List<AttributesDto> attributes;
}
