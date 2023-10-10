package com.stanzaliving.core.commercialcode.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommercialMetaDataDto {

    private String label;
    private String value;
    private String gstAmountLabel;
    private String gstPercentageLabel;
    private String valueExclusiveGstLabel;
    @Builder.Default
    private String note = "";
    private String abbreviation;

}