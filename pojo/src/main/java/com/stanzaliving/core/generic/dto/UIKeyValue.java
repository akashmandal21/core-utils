
package com.stanzaliving.core.generic.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(exclude = {"label"})
public class UIKeyValue {
    @NotBlank
    private String label;
    @NotBlank
    private String value;
}

