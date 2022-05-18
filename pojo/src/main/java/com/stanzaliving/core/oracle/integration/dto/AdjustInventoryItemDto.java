package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AdjustInventoryItemDto {

    @JsonProperty("item")
    private String item;

    @JsonProperty("quantity")
    private BigDecimal quantity;

    @JsonProperty("stanzaLineId")
    private Integer stanzaLineId;

    @JsonProperty("unitcost")
    private BigDecimal unitCost;

    @JsonProperty("department")
    private Department department;

    @JsonProperty("class")
    private String clazz;

    @JsonProperty("account")
    private String account;

}
