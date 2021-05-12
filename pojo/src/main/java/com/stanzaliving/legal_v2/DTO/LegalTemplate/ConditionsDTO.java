package com.stanzaliving.legal_v2.DTO.LegalTemplate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ConditionsDTO {

    private String operator;

    private OperandDTO operand;

    private int order;
}
