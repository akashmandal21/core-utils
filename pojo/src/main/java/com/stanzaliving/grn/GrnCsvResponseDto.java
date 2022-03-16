package com.stanzaliving.grn;

import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import com.stanzaliving.po.enums.PoStatus;
import com.stanzaliving.po.enums.PoType;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class GrnCsvResponseDto {

    private String itemName;
    private String itemDescription;
    private String itemCode;
    private BigDecimal itemGst;
    private BigDecimal itemQuantity;
    private BigDecimal totalAccepted;
    private String uom;
    private BigDecimal itemUnitRate;
    private String gsriId;
    private BigDecimal okQuantity;
    private String receivedLocationName;
    private String poNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private GenericPOTOStatus poStatus;
    private GenericPOType poType;
    private BigDecimal poAmount;
    private String poUuid;
    private BigDecimal invoiceQuantity;
    private String vendorUuid;

}
