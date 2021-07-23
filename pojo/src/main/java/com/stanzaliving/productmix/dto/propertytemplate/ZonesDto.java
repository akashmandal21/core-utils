package com.stanzaliving.productmix.dto.propertytemplate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZonesDto {

    @NotBlank(message = "Zone uuid cannot be blank")
    private String uuid;

    @NotBlank(message = "Zone label cannot be blank")
    private String label;

    @NotNull(message = "Zone enable status cannot be null")
    private Boolean enabled;

    private List<AttributesDto> attributes;
}
