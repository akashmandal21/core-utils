package com.stanzaliving.core.oracle.integration.dto;

import com.stanzaliving.invoice.enums.Category;
import com.stanzaliving.invoice.enums.ExpenseType;
import com.stanzaliving.invoice.enums.InvoiceType;
import com.stanzaliving.invoice.enums.VoucherType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class OracleIntegrationInvoiceDto extends AbstractOracleDto {

    private String stanzaId;
    private String documentNumber;
    private Date date;
    private Date dueDate;
    private String vendor;
    private String location;
    private String currency;
    private double exchangeRate;
    private String poNumber;
    private InvoiceType invoiceType;
    private String documentName;
    private String invoiceCopy;
    private String vendorCode;
    private VoucherType voucherType;
    private Category category;
    private String vertical;
    private String group;
    private String subGroup;
    private ExpenseType expenseType;
    private String glCode;
    private String narration;
    private String taxCode;
    private String tdsSection;
    private Double tdsRate;
    private BigDecimal tdsAmount;
    private BigDecimal provision;
    private BigDecimal difference;
    private BigDecimal retentionAmount;
    private Date retentionDueDate;
    private List<OracleIntegrationInvoiceItemDto> itemList;

}
