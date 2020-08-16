package com.stanzaliving.core.generic.validation.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorInfo {
    private boolean errorOccurred;
    private int numErrors;
}
