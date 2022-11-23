package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TOItemDto {

    @JsonProperty("item")
    private String item;

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("rate")
    private String rate;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("hsnCode")
    private String hsnCode;

    @JsonProperty("indiataxnature")
    private String indiaTaxNature;

}
