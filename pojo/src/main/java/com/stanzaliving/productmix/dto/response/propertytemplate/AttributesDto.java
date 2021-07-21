package com.stanzaliving.productmix.dto.response.propertytemplate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttributesDto {

    private String uuid;

    private String label;

    private Boolean enabled;
}
