package com.stanzaliving.core.generic.validation.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApprovableUIKeyValue {
    private String label;
    private String value;
    private boolean approved;
    private String approvedByRole;
}
