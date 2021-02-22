package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.far.enums.AmcType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AmcDto {
    private AmcType amcType;
    private String vendorName;
    private Date amcStartDate;
    private Date amcEndDate;
    private String pocName;
    private String pocContactNumber;
    private String pocEmail;
    private String AmcIncludes; // Multiple select options based on the item selected
    private String AmcExcludes; // Multiple select options based on the item selected
    private String amcDocumentPath; // where the uploaded doc. by user is stored
}