package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeadFormAndPricingDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer sequenceId;

    private String name;

    private Integer startingPrice;

    private Integer discountedPrice;

    private boolean soldOut;

    private String leadFormName;

    private String transformationUuid;
}
