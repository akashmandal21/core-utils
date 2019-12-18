package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class EstateAttributeDto extends AbstractDto {

    private String estateUuid;

    private String attributeName;

    private String attributeValue;

}
