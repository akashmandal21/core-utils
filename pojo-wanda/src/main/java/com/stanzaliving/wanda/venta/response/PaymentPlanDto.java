package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.wanda.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlanDto {
        private String id;
        private double invoiceAmount;
        private double invoicePaid;
        private double invoiceDue;
        private Date dueDate;
        private Date executionDate;
        private Date fromDate;
        private Date toDate;
        private InvoiceType invoiceType;
        private String referenceId;
        private String referenceType;
        private List<TemporaryInvoiceLineItemDto> lineItem;

}
