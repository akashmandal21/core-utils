package com.stanzaliving.legal_v2.DTO.LegalTemplate;

import com.stanzaliving.legal_v2.enums.MandatoryConditionEnum;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MandatoryConditionDTO {

    private MandatoryConditionEnum type;

    private List<ConditionsDTO> condition;
}
