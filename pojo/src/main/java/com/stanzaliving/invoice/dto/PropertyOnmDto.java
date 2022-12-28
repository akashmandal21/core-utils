package com.stanzaliving.invoice.dto;

import com.stanzaliving.booking.enums.ResidenceAgreementType;
import com.stanzaliving.invoice.enums.InvoiceStatus;
import com.stanzaliving.invoice.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PropertyOnmDto {

    private String residenceUuid;

    private String fixedRent;

    private Double managementFeePercentage;

    private ResidenceAgreementType agreementType;

}
