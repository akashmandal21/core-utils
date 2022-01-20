package com.stanzaliving.legal_v2.DTO.LegalTemplate;

import com.stanzaliving.legal_v2.enums.VisibilityConditionEnum;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisibilityConditionDTO {

    private VisibilityConditionEnum type;

    private List<ConditionsDTO> condition;
}
