package com.stanzaliving.grn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class GSRITuple {

    private String tupleName;

    private String tupleId;

    private BigDecimal total;

    private BigDecimal recieved;

    private BigDecimal returned;

    private BigDecimal rejected;

    private BigDecimal installed;

    private BigDecimal boqQuantity;

    private BigDecimal negativeBoqQuantity;

}
