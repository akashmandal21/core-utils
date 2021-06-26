package com.stanzaliving.legal_v2.DTO.LegalTemplate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ConditionsDTO {

    private String operator;

    private List<OperandDTO> operands;

    private int order;
}
