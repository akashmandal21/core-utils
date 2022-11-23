package com.stanzaliving.sfr.dto.questionTemplate.conditions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class MandatoryConditionDto {
    private String type;
    private List<ConditionDto> condition;
}
