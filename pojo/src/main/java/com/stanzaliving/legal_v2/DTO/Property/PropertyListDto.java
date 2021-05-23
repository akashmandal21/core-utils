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

    @NotNull(message = "Property Name cannot be null")
    private String propertyName;

    @NotNull(message = "Property type cannot be null")
    private String propertyType;

    @NotNull(message = "city cannot be null")
    private String city;

    @NotNull(message = "Micro market cannot be null")
    private String microMarket;

    @NotNull(message = "Status cannot be null")
    @Enumerated(EnumType.STRING)
    private PropertyListStatus status;

    @NotNull(message = "Template cannot be null")
    private String legalTemplateId;

}
