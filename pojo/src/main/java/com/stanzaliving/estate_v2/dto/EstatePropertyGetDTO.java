package com.stanzaliving.estate_v2.dto;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.core.user.dto.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EstatePropertyGetDTO extends AbstractMongoDto {

    private String status;
    private String estateName;
    private Address address;
    private String cityId;
    private String cityName;
    private String micromarketId;
    private String micromarketName;
    private Double lat;
    private Double lon;
    private String estateStatus;
    private String estateCode;
    private String managerName;
    private String propertyName;
    private String legalAgreementDocType;

}
