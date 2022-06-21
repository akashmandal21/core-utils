package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.PVApplicable;
import com.stanzaliving.core.security.policeverification.enums.RegistrationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class PVConfigDto {

    private String cityName;

    private String micromarketName;

    private RegistrationType registrationType;

    private PVApplicable pvApplicableType;

    private boolean panOrAadhaarRequired;

}
