package com.stanzaliving.po.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoListingDto {

    private String poPropertyId;

    private String poDetailsId;

    private String poNumber;

    private String poType;

    private String vendorName;

    private String pocName;

    private String pocMobile;

    private Double totalPoAmount;

    private String poStatus;

    private String colorCode;

    private String backgroundColorCode;

    private Boolean isCancellationRejected;

    private boolean asisPo;

}
