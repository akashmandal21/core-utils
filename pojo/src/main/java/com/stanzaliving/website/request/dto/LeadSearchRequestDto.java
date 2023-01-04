package com.stanzaliving.website.request.dto;

import com.stanzaliving.core.leadership.dto.DateRange;

import java.util.List;



import com.stanzaliving.core.leaddashboard.enums.LeadSourceEnum;
import com.stanzaliving.core.leaddashboard.enums.LeadStatus;
import com.stanzaliving.core.leaddashboard.enums.LeadSubStatus;


import com.stanzaliving.website.enums.LeadMetricsEnum;
import com.stanzaliving.website.enums.LeadQualifiedBy;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author raj.kumar
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class LeadSearchRequestDto extends UserRoleDto {

    private String sortByField;
    private String sortByOrder;
    private String viewLead;
    private List<LeadStatus> status;
    private List<LeadSubStatus> subStatus;
    private List<LeadMetricsEnum> leadSubStatus;

    private String phone;
    private String firstName;
    private List<LeadSourceEnum> leadSource;

    private String leadTag;

    private List<String> leadOwnerUuids;
    private List<String> residenceUuids;
    private List<String> cityUuids;

    //For internal usage
    private List<String> leadUuids;
    private List<LeadStatus> statusExcluded;

    private int page;
    private int limit;

    private DateRange createdAt;
    private DateRange taskDateRange;
    private boolean excludePreBooking;

    //For bulk lead transfer
    private String leadOwnerAssignmentUuid;
    private List<String> leadOwnerAssignmentMicromarketUuids;
    private boolean priorityLeadTag;

    private List<LeadQualifiedBy> qualifiedBy;
    private String apiVersion;
}