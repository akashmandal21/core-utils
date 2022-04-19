package com.stanzaliving.residence.dto;

import com.stanzaliving.transformations.pojo.AddressBookMetaDto;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResidencePropertyCardDto {
    private String name;
    private AddressBookMetaDto address;
    private String gender;
    private String city;
    private String microMarket;
    private String code;
    private String apartmentType;
    private boolean serviceMix;
    private boolean productMix;
    private String propertyType;
    private String propertyCompany;
    private boolean bookingEnabled;
}
