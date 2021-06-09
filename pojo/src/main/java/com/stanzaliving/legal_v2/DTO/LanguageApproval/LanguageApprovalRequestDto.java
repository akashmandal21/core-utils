package com.stanzaliving.legal_v2.DTO.LanguageApproval;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.legal_v2.DTO.BdRemarks.BdRemarksDto;
import com.stanzaliving.legal_v2.enums.PropertyListStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class LanguageApprovalRequestDto extends AbstractMongoDto {

    @NotNull
    private String propertyUuid;

    @NotNull
    private String templateId;

    private List<BdRemarksDto> bdRemarks;

    @NotNull
    private PropertyListStatus status;


}
