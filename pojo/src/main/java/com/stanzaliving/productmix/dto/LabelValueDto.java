package com.stanzaliving.productmix.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LabelValueDto {

    @NotBlank(message = "Value cannot be blank")
    private String value;

    @NotBlank(message = "Label cannot be blank")
    private String label;
}
