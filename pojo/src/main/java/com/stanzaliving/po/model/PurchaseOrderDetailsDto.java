package com.stanzaliving.po.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderDetailsDto {

    private String purchaseOrderDetailsId;

    private String propertyId;

    private String poType;

    private String scopeOfWork;

    private String completionDate;

    private String stanzaGstin;

    private String deliveryLocation;

    private String billToAddress;

    private String poStatus;

}
