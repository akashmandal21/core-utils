package com.stanzaliving.grn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class GSRIReceivedQuantity {

    private String itemCode;

    private String itemUuid;

    private BigDecimal gsriRcvdQuantity;
}
