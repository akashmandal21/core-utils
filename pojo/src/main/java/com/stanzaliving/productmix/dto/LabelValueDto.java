package com.stanzaliving.productmix.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LabelValueDto<T> {

    @NotNull(message = "Value cannot be null")
    private T value;

    @NotNull(message = "Label cannot be null")
    private String label;
}
