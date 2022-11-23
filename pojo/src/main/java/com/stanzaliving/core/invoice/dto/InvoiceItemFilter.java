package com.stanzaliving.core.invoice.dto;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceItemFilter {

    private boolean search;

    private List<UIKeyValue> costHead;

    private List<UIKeyValue> category;

    private List<UIKeyValue> subCategory;

    private List<String> itemCodes;

    private String itemUuid;

    private boolean excludingCodes;

    private String searchKey;

}
