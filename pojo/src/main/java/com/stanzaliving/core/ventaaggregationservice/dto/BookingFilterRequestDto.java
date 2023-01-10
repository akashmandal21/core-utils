package com.stanzaliving.core.ventaaggregationservice.dto;

import com.stanzaliving.core.ventaaggregationservice.enums.ExitVisibility;
import com.stanzaliving.core.ventaaggregationservice.enums.RiskProfile;
import com.stanzaliving.genericdashboard.dto.DateRangeDto;
import com.stanzaliving.website.request.dto.UserRoleDto;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookingFilterRequestDto extends UserRoleDto {

    private Boolean moveIn;

    private Boolean agreementSent;

    private Set<RiskProfile> risk;

    private Set<String> statusFilter;

    private Set<String> bookingType;

    private Set<String> bookingSubType;

    private String dues;

    private Date contractStartDate;

    private Set<String> bookingIds;

    private Set<String> leadIds;

    private Set<String> userUuids;

    private Set<String> cityList;

    private Set<String> residenceList;

    private Set<String> microMarketList;

    private Set<String> subStatus;

    private Set<String> status;

    private Set<String> bookingMode;

    private Integer pageSize;

    private Integer pageNumber;

    private String sortBy;

    private String sortOrder;

    private String entity;

    private Set<String> ledgerStatus;

    private DateRangeDto contractEndDate;

    private DateRangeDto moveOutDate;

    private LocalDateTime lastContractEndDate;

    private LocalDateTime lastMoveOutDate;

    private DateRangeDto contractStartDates;

    private LocalDateTime lastContractStartDate;

    private Date exitDate;

    private Boolean auditCompleted;

    private Boolean retentionBooking;

    private ExitVisibility exitVisibility;

    private Boolean potentialDefaulter;

    private String residentMobile;

    private String residentId;

    private Date tillContractEndDate;

    private boolean ignoreMoveInFlag;

    private Set<String> createdBy;

    private Set<String> residenceUuidList;

    private DateRangeDto moveInDate;
}
