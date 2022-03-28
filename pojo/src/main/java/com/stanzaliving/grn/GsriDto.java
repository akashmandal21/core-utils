package com.stanzaliving.grn;

import com.stanzaliving.core.generic.po.enums.EventType;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class GsriDto {

    private String gsriId;
    private EventType eventType;
    private Date gsriDate;
    private BigDecimal gsriQuantity;
    private BigDecimal gsriAmount;
}
