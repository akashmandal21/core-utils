package com.stanzaliving.legal_v2.DTO.LegalTemplate;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OperandDTO {

    private String key;

    private List<KeyValueDTO> value;
}
