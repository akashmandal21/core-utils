package com.stanzaliving.core.commercialcode.dto;

import lombok.Data;

import java.util.List;

@Data
public class CommercialDataDto {
   private String commercialId;
   private String commercialName;
   private List<CommercialMetaDataDto> commercialData;
   private boolean disabled;
   private boolean autoApplicable;
   private List<String> applicabilityCriteria;
}
