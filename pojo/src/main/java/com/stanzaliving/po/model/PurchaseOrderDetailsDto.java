package com.stanzaliving.po.model;

import com.stanzaliving.po.enums.PoLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderDetailsDto {

    private String purchaseOrderDetailsId;

    private String propertyId;

    private String poNumber;

    private String poType;

    private String scopeOfWork;

    private String completionDate;

    private String stanzaGstin;

    private String deliveryLocation;

    private String billToAddress;

    private String poStatus;
    
    private boolean acceptRegularInvoices;

    private String confirmatoryEmailUrl;

    private PoLevel poLevel;

    private String poLevelDetailId;

    private String poLevelDetail;

    private String poStartDate;

    private String poEndDate;

    private String cancellationReason;

    private String approvalDate;

    private String createdAt;

    private Long cityId;

}
