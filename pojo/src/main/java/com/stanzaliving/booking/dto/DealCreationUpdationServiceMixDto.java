package com.stanzaliving.booking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DealCreationUpdationServiceMixDto {
    
    private String dealName;
    private String dealUuid;
    private String dealType;
    private Timestamp dealStartDate;
    private Timestamp dealEndDate;
    private Timestamp dealCreatedDate;
    private String dealStatus;
    private String workDocumentUrl;
    private List<DealResidenceBedMapping> residenceBedMapping;
    private List<DealPocDto> institutePoc;
    private List<DealStanzaPocDto> stanzaPoc;
    private Timestamp dealApprovedOn;
    private boolean isMgDeal;
}
