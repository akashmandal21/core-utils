package com.stanzaliving.core.generic.validation.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode(exclude = {"label","approved","canApprove"})
public class ApprovableUIKeyValueUI {
    private String label;
    private String value;
    private boolean canApprove;
    private boolean approved;
}
