package com.stanzaliving.po.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class PoListForFinanceDto {

    private String propertyId;

    private String poDetailsId;

    private String poNumber;

    private String poType;

    private String houseName;

    private String cityId;

    private String poStatus;

    private BigDecimal amountAlreadyPaid;

    private String paymentStatus;

    private String state;

    private String cityName;

}
