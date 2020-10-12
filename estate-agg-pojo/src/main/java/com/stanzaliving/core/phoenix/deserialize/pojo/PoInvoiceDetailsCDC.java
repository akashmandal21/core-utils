package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.po.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PoInvoiceDetailsCDC {

    @JsonProperty("id")
    private Long poInvoiceId;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("updated_at")
    private Date updatedAt;

    @JsonProperty("updated_by")
    private String updatedBy;

    @JsonProperty("status")
    private boolean status = true;

    @JsonProperty("uuid")
    String poInvoiceUuid;

    @JsonProperty("po_details_id")
    private String poDetailsId;

    @JsonProperty("invoice_type")
    private InvoiceType invoiceType;

    @JsonProperty("invoice_no")
    private String invoiceNo;

    @JsonProperty("invoice_date")
    private Date invoiceDate;

    @JsonProperty("fee_or_tax")
    private String feeOrTax;

    @JsonProperty("invoice_amount")
    private BigDecimal invoiceAmount;

    @JsonProperty("invoice_url")
    private String invoiceUrl;

    @JsonProperty("invoice_status")
    private String invoiceStatus;

    @JsonProperty("amount_paid_to_vendor")
    private Double amountPaidToVendor;

}
