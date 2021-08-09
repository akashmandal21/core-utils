package com.stanzaliving.core.commercialcode.dto;

import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ToString
public class CommercialCardRequestDto {

    @NotNull(message = "City uuid cannot be null")
    @NotEmpty(message = "City uuid required")
    private String cityUuid;

    @NotNull(message = "Micromarket uuid cannot be null")
    @NotEmpty(message = "Micromarket uuid required")
    private String micromarketUuid;

    @NotNull(message = "Residence uuid cannot be null")
    @NotEmpty(message = "Residence uuid required")
    private String residenceUuid;

    @NotNull(message = "Tenure period cannot be null")
    @NotEmpty(message = "Tenure period required")
    private String tenurePeriod;


    @NotNull(message = "Lock-In cannot be null")
    @NotEmpty(message = "Lock-In period required")
    private String lockInPeriod;

    private CommercialCardUserType commercialCardUserType;
}
