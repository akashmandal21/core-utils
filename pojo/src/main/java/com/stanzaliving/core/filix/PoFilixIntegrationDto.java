package com.stanzaliving.core.filix;

import com.stanzaliving.core.po.generic.enums.GenericPOType;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoFilixIntegrationDto {

    private GenericPOType poType;

    private LocalDate date;

    private LocalDate poStartDate;

    private LocalDate poEndDate;

    private String scopeOfWork;

    private String deliveryLocationType;

    private String deliveryAddress;

    private String billingAddress;

    private String subsidiaryTaxRegNumber;

    private String vendorCode;

    private String vendor;

    private String vendorPocName;

    private String vendorTaxRegNumber;

    private String vendorPocDesignation;

    private String vendorPocEmail;

    private List<PoItemFilixIntegrationDto> item;

    private Double feeType;

    private Double taxRate;

    private String taxBasis;

    private Double amount;

    private Double subTotal;

    private Double taxTotal;

    private Double total;

    private String advanceType;

    private Double advanceValue;

    private Double advanceAmount;

    private String retentionType;

    private Double retentionValue;

    private Double retentionAmount;

    private String paymentTerms;


}
