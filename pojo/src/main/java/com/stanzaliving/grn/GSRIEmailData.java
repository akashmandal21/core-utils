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
public class GSRIEmailData {

    private String poNumber;

    private String poLocation;

    private String vendorName;

    private String poDuration;

    private String itemCode;

    private String itemName;

    private BigDecimal poQuantity;

    private BigDecimal receivingPending;

}
