package com.stanzaliving.core.generic.validation.dtos;

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
    private boolean isCityEligible;
}
