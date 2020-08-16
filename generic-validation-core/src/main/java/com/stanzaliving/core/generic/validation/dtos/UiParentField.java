package com.stanzaliving.core.generic.validation.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UiParentField extends UiBaseField  {
    private boolean mandatory;
    private boolean editable;
    private boolean canApprove;
    private boolean errorOccurred;
}