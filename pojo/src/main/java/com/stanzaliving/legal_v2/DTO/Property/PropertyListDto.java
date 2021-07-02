package com.stanzaliving.legal_v2.DTO.Property; 

import com.stanzaliving.core.dto.AbstractMongoDto;
import lombok.*;

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
    private String rooms;
    private String availableBeds;
    private String rent;

}
