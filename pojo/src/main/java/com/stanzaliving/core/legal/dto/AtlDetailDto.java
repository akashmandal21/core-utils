package com.stanzaliving.core.legal.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.legal.enums.AtlDetailsEnum;
import com.stanzaliving.core.legal.enums.LegalStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
@ToString(callSuper = true)
public class AtlDetailDto extends AbstractDto {

    private String item;

    private String duration;

    private String scopeDefinition;

    private String remarks;

    private LegalStatus legalStatus;

    private String estateUuid;

    private AtlDetailsEnum atlDetailsEnum;
    
    private boolean isApprovedBySandeep;

}
