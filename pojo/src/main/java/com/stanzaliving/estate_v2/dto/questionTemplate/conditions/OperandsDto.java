package com.stanzaliving.estate_v2.dto.questionTemplate.conditions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class OperandsDto implements Serializable {
    private String key;
    private String value;
}
