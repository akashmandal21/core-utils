package com.stanzaliving.sfr.dto.questionTemplate.conditions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class VisibilityConditionDto implements Serializable {
    private String type;
    private List<ConditionDto> condition;
}
