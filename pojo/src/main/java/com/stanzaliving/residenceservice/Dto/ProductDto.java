package com.stanzaliving.residenceservice.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@SuperBuilder
public class ProductDto {

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("product_category")
    private String productCategory;

    @JsonProperty("product_status")
    private String productStatus = "Active";

}
