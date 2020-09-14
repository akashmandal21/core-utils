package com.stanzaliving.core.utility.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UtilityMasterDto extends AbstractDto {
    @NotBlank(message = "Name Cannot Be Blank")
    private String name;
    private String description;
    private UnitType unit;
    private String unitName;
    private boolean expenseAllowed;
    private boolean metered;
    private List<UtilityExpenseTypeDto> type;
}
