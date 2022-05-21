package com.stanzaliving.core.generic.validation.dtos;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode(exclude = {"label","approvalLevel"})
public class ApprovableUIKeyValue implements Serializable {
    private String label;
    @NotBlank
    private String value;

    private Integer approvalLevel;

    private boolean isCityEligible;
}
