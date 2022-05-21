package com.stanzaliving.core.generic.validation.dtos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("isCityEligible")
    @JsonAlias("cityEligible")
    private boolean isCityEligible;
}
