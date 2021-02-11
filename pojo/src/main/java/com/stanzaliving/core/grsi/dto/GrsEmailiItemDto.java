package com.stanzaliving.core.grsi.dto;

import com.stanzaliving.core.base.enums.Department;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GrsEmailiItemDto {

    private String ItemName;
    private String ItemCode;
    private String POQty;
    private String QTYInstalled;
    private String QTYRejected;
    private String ReceivingLocation;
    private String QTYReceived;
    private String QTYReturned;
}
