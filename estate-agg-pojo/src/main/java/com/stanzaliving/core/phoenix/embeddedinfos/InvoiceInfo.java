package com.stanzaliving.core.phoenix.embeddedinfos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceInfo {

    private String poInvoiceUuid;

    private String poInvoiceStatus;

    private Date poInvoiceCreatedAt;

    private Date poInvoiceUpdatedAt;

    private String poInvoiceCreatedBy;

    private String poInvoiceUpdatedBy;

}
