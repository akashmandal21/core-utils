package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.dto.PageAndSortDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceSearchDto extends AbstractDto {
    private String searchKeyword;
    private PageAndSortDto pageDto;
    private List<String> cityIds;
    private List<String> micromarketIds;
    private List<String> residenceIds;
}
