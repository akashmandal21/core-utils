package com.stanzaliving.sfr.dto;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.core.user.dto.Address;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class LegalPropertyDto extends AbstractMongoDto{

    private String propertyName;
    private String propertyType;
    private String city;
    private String microMarket;
    private String status;
    private String propertyTypeUUid;
    private String rooms;
    private String availableBeds;
    private String rent;
    private Address address;
    private String createdByUserEmail;
    private boolean legalDeviation;
    private boolean businessDeviation;
    private boolean sowApproval;
}
