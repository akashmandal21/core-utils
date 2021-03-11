package com.stanzaliving.grn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GSRITuple {

    private String tupleName;

    private String tupleId;

    private BigDecimal total;

    private BigDecimal received;

    private BigDecimal returned;

    private BigDecimal rejected;

    private BigDecimal installed;

    private BigDecimal boqQuantity;

    private BigDecimal negativeBoqQuantity;

}
