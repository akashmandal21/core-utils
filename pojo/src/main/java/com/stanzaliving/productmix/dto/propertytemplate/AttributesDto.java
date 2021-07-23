package com.stanzaliving.productmix.dto.propertytemplate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttributesDto {

    @NotBlank(message = "Attribute uuid cannot be blank")
    private String uuid;

    @NotBlank(message = "Attribute label cannot be blank")
    private String label;

    @NotNull(message = "Attribute enable status cannot be null")
    private Boolean enabled;
}
