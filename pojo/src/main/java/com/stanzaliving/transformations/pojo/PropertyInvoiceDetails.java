package com.stanzaliving.transformations.pojo;

import com.stanzaliving.booking.enums.ResidenceAgreementType;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PropertyInvoiceDetails {

    private String uuid;

    private String cin;

    private String pan;

    private Integer cityBillingInformationId;

    private String cityUuid;

    private String gstin;

    private String gstStateUuid;

    private String gstState;

    private String address;

    private String footerAddress;

    private String microMarketUuid;

    private String microMarketName;

    private String cityName;

    private Integer zipcode;

    private String footerMicroMarketUuid;

    private String footerCityUuid;

    private String footerMicroMarketName;

    private String footerCityName;

    private Integer footerZipcode;

    private Integer gstCode;

    private String companyName;

    private List<LandlordDetailsDto> landlordDetailsDtoList;

    private PropertyCommercialDetails propertyCommercialDetails;

    private ResidenceAgreementType agreementType;

    private String fixedRent;

    private LocalDate hoToDate;

}
