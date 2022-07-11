package com.stanzaliving.productmix.dto.meta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZonesAttributes {

    @NotBlank(message = "Attribute name cannot be blank")
    private String name;

    private int position;
}
