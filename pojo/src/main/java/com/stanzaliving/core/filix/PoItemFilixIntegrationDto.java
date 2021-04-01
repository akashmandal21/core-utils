package com.stanzaliving.core.filix;

import lombok.*;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoItemFilixIntegrationDto {

    private String description;

    private String indiaTaxHsn;

    private String uom;

    private Double quantity;

    private Double rate;

    private Double taxRate;

    private Double rentPeriod;

    private String refundableSdType;

    private Double refundableSdValue;

    private Double amount;

    private Double poRefundableDeposit;

    private Double poItemsSubTotal;

    private Double poItemsGST;

    private Double poItemsTotal;

}
