package com.stanzaliving.estate_v2.dto.questionTemplate.conditions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ConditionDto  {
    private String operator;
    private List<OperandsDto> operands;
    private Integer order;
}
