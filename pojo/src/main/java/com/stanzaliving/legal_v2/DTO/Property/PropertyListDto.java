package com.stanzaliving.legal_v2.DTO.Property;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.legal_v2.enums.PropertyListStatus;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyListDto extends AbstractMongoDto {
    private String propertyName;
    private String propertyType;
    private String city;
    private String microMarket;
    private String status;
    private String propertyTypeUUid;

}
