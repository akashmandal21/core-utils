package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.PVApplicable;
import com.stanzaliving.core.security.policeverification.enums.RegistrationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class PVConfigDto {

    @NotBlank(message = "City Name is mandatory")
    private String cityName;

    @NotBlank(message = "Micromarket Name is mandatory")
    private String micromarketName;

    @NotNull(message = "Registration Type Type is mandatory")
    private RegistrationType registrationType;

    @NotNull(message = "PVApplicable Type is mandatory")
    private PVApplicable pvApplicableType;

    private boolean panOrAadhaarRequired;

}
