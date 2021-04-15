package com.stanzaliving.core.opscalculator.dto.rules;

import java.io.Serializable;

import com.stanzaliving.core.opscalculator.enums.FixedVariableCalculatorCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class RulesFixedVariableServiceWiseDto implements Serializable {

    private String residenceUuid;

    private FixedVariableCalculatorCategory calculatorCategory;

    private int fixedPercent;

    private int variablePercent;

}
