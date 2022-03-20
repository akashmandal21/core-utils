package com.stanzaliving.grn;

import com.stanzaliving.core.base.enums.Department;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class CsvItemInfoDto {

    private String itemName;
    private String itemDescription;
    private String itemCode;
    private BigDecimal itemGst;
    private BigDecimal itemQuantity;
    private BigDecimal totalAccepted;
    private String uom;
    private BigDecimal itemUnitRate;
    private String itemUuid;
    private BigDecimal okQuantity;
    private BigDecimal invoiceQuantity;

    List<String> gsriIds;
}
