
package com.stanzaliving.core.generic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class UIKeyValue {
    @NotBlank
    private String label;
    @NotBlank
    private String value;
}