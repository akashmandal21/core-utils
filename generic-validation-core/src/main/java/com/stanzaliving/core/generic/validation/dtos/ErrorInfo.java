package com.stanzaliving.core.generic.validation.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorInfo {
    private boolean errorOccurred;
    private int numErrors;
    private List<String> errorList;

    public ErrorInfo(boolean errorOccurred, int numErrors){
        this.errorOccurred = errorOccurred;
        this.numErrors = numErrors;
    }
}
