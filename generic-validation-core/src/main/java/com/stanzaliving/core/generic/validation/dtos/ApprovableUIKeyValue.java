package com.stanzaliving.core.generic.validation.dtos;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode(exclude = {"label","approvalLevel"})
public class ApprovableUIKeyValue {
    private String label;
    @NotBlank
    private String value;

    private Integer approvalLevel;
}
