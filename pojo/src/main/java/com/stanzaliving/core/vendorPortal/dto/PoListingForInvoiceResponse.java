package com.stanzaliving.core.vendorPortal.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PoListingForInvoiceResponse {

    private String poUuid;
    private String poToNumber;
    private Date createdOn;
    private String createdBy;
    private BigDecimal poAmount;
    private String deliveryLocationName;
}
