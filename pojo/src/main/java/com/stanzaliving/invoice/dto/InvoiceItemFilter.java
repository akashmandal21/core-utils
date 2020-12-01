package com.stanzaliving.invoice.dto;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceItemFilter {

    private UIKeyValue costHead;

    private UIKeyValue category;

    private UIKeyValue subCategory;

    private String searchKey;

}
