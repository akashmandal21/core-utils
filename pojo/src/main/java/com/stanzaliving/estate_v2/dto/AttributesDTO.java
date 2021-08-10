package com.stanzaliving.estate_v2.dto;

import com.stanzaliving.core.dto.AbstractMongoDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AttributesDTO extends AbstractMongoDto {
    private String estateId;
    private String status;
    private String attributeName;
    private String attributeValue;
}
