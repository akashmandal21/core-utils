package com.stanzaliving.sfr.dto;

import com.stanzaliving.core.dto.AbstractMongoDto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AttributesDTO extends AbstractMongoDto {
    private String estateId;
    private String status;
    private String attributeName;
    private List<String> attributeValue;
}
