package com.stanzaliving.legal_v2.DTO.LegalTemplate;

import com.stanzaliving.legal_v2.enums.DeviationsStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class DeviationDTO  {

    private String uuid;

    @NotEmpty(message = "deviationName cannot be empty")
    private String deviationName;

    private String deviationText;

    private String title;

    @NotNull
    private DeviationsStatus deviationStatus;

    private VisibilityConditionDTO visibilityCondition;

    private MandatoryConditionDTO mandatoryCondition;
}
