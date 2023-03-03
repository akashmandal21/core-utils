package com.stanzaliving.legal_v2.DTO.LegalTemplate;

import com.ibm.icu.util.Region;
import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.legal_v2.enums.RegionType;
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

    private RegionType regionType;

    private String regionValue;

    @NotNull
    private TemplateStatus templateStatus;

    private String mappedPropertyTypeUUID;

    private String mappedPropertyType;

    @Valid
    private List<DeviationDTO> deviationList;

    private List<CodeBlock> codeBlockList;

}
