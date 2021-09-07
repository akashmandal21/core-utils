package com.stanzaliving.core.far.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AmcResponseDto {
    private String amcDocumentNumber;
    private String amcType;
    private String vendorName;
    private Date amcStartDate;
    private Date amcEndDate;
    private String pocName;
    private String pocContactNumber;
    private String pocEmail;
    private String amcIncludes; // Multiple select options based on the item selected
    private String amcExcludes; // Multiple select options based on the item selected
    private List<String> amcDocumentPathList; // where the uploaded doc. by user is stored
    private List<String> amcDocumentUrlList;
}