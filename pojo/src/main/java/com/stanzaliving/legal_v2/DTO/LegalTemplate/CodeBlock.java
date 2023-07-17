package com.stanzaliving.legal_v2.DTO.LegalTemplate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CodeBlock {

    private String variableName;

    private String codeScript;
}
