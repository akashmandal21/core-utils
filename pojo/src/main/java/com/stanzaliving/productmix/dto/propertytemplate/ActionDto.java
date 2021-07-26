package com.stanzaliving.productmix.dto.propertytemplate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ActionDto {

    @NotBlank
    private String action;

    @NotBlank
    private String uuid;
}
