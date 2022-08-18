package com.stanzaliving.core.generic.validation.dtos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode(exclude = {"label","approved","canApprove"})
public class ApprovableUIKeyValueUI implements Serializable {
    private String label;
    private String value;
    private boolean canApprove;
    private boolean approved;
    @JsonProperty("isCityEligible")
    @JsonAlias("cityEligible")
    private boolean isCityEligible;
}
