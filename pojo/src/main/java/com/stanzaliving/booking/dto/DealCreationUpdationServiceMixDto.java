package com.stanzaliving.booking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.booking.DealType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DealCreationUpdationServiceMixDto {

    @NotNull(message = "Deal startdate is mandatory")
    private LocalDate dealStartDate;
    @NotNull(message = "Deal enddate is mandatory")
    private LocalDate dealEndDate;
    private String dealName;
    private String dealUuid;
    private DealType dealType;
    private Date dealCreatedDate;
    private String dealStatus;
    private String workDocumentUrl;
    private List<DealResidenceBedMapping> residenceBedMapping;
    private List<DealPocDto> institutePoc;
    private List<DealStanzaPocDto> stanzaPoc;
    private Timestamp dealApprovedOn;
    private boolean isMgDeal;
    private String dealCreatedBy;
}
