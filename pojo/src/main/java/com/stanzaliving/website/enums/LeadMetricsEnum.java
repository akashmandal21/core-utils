package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;

import lombok.Getter;
import com.stanzaliving.core.leaddashboard.enums.LeadSubStatus;
import java.util.*;

@Getter
@AllArgsConstructor
public enum LeadMetricsEnum {

    PRE_QUALIFICATION_NO_ACTION("Pre-Qualfication - No Action","#FFD119",Arrays.asList(LeadSubStatus.NEW_LEAD)),
    PRE_QUALIFICATION_RNR("Pre-Qualification - RNR","#9B82A5",Arrays.asList(LeadSubStatus.RNR)),
    PRE_QUALIFICATION_FOLLOW_UP_NEEDED("Pre-Qualification - Follow up needed","#5FD1D9",Arrays.asList(LeadSubStatus.PRE_QUALIFICATION_FOLLOW_UP)),
    QUALIFIED_NO_ACTION("Qualified - No Action","#FAB432",Arrays.asList(LeadSubStatus.PRE_VISIT_SCHEDULED_FOLLOW_UP)),
    QUALIFIED_ATTEMPTED("Qualified - Attempted","#5FC4F5",Arrays.asList(LeadSubStatus.QUALIFIED_ATTEMPTED)),
    QUALIFIED_VISIT_SCHEDULED("Qualified - Visit Scheduled","#F591AA",Arrays.asList(LeadSubStatus.PRE_VISIT_FOLLOW_UP, LeadSubStatus.VISIT_1_SCHEDULED, LeadSubStatus.VISIT_2_SCHEDULED, LeadSubStatus.VISIT_3_SCHEDULED, LeadSubStatus.VISIT_4_SCHEDULED, LeadSubStatus.VISIT_5_SCHEDULED)),
    QUALIFIED_VISIT_COMPLETED("Qualified - Visit Completed","#60C3AD",Arrays.asList(LeadSubStatus.POST_VISIT_1_FOLLOW_UP, LeadSubStatus.POST_VISIT_2_FOLLOW_UP, LeadSubStatus.POST_VISIT_3_FOLLOW_UP, LeadSubStatus.POST_VISIT_4_FOLLOW_UP, LeadSubStatus.POST_VISIT_5_FOLLOW_UP,LeadSubStatus.VISIT_1_STARTED, LeadSubStatus.VISIT_2_STARTED, LeadSubStatus.VISIT_3_STARTED, LeadSubStatus.VISIT_4_STARTED, LeadSubStatus.VISIT_5_STARTED));


    private String statusDescription;
    private String colorCode;
    private List<LeadSubStatus> leadSubStatus;




}
