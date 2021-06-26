package com.stanzaliving.legal_v2.DTO.LegalTemplate;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.legal_v2.enums.TemplateStatus;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LegalTemplateDTO extends AbstractMongoDto {


    @NotEmpty(message = "Template Name should be passed")
    private String templateName;

    private String description;

    private String document;

    @NotNull
    private TemplateStatus status;

    private String mappedPropertyType;

    @Valid
    private List<DeviationDTO> deviationList;

}
