package com.stanzaliving.po.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class PoListingDto {

    private String poDetailsId;

    private Integer poNumber;

    private String poType;

    private String vendorName;

    private String pocName;

    private String pocMobile;

    private Double totalPoAmount;

    private String poStatus;

}
