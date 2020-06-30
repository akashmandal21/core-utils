package com.stanzaliving.po.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PoResponse {

    private String poDetailsId;

    private PurchaseOrderDetailsDto purchaseOrderDetails;

    private List<PoItemDetailsDto> poItemDetailsList;

    private PoVendorDetailsDto poVendorDetails;

    private PoFinanceDetailsDto poFinanceDetails;

    private Boolean isSubmitted = Boolean.FALSE;

    private Boolean isShortCloseAllowed = Boolean.TRUE;

    private Boolean isCancellationAllowed = Boolean.TRUE;

}
