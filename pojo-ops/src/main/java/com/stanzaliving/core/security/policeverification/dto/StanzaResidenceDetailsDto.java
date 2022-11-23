package com.stanzaliving.core.security.policeverification.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class StanzaResidenceDetailsDto extends AddressDetailsDto {

    private String residenceUuid;

    private String micromarketUuid;

    private String micromarketName;

    private String cityUuid;

    private String countryUuid;

}
