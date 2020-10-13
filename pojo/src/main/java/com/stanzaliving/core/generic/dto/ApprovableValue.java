
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
public class ApprovableValue {

    private String approved;

    @NotBlank
    private String value;

}

