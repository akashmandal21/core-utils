package com.stanzaliving.po.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PoListForFinanceDto {

    private String propertyId;

    private String poNumber;

    private String poType;

    private String houseName;

    private String city;

    private String poStatus;

    private Double amountAlreadyPaid;

    private String paymentStatus;

}
