package com.stanzaliving.support.enums;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public enum SupportRole {

    SIGMA_CUSTOMER_SUPPORT(1,"SIGMA_CUSTOMER_SUPPORT", AccessLevel.COUNTRY, Collections.emptyList()),
    SUPPORT_TICKET_VIEW_ALL(1,"SUPPORT_TICKET_VIEW_ALL", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)), // 1
    SUPPORT_TICKET_EDIT_ALL(1,"SUPPORT_TICKET_EDIT_ALL", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD, SupportModule.TICKET_ESCALATION)), // 1
    SUPPORT_TICKET_VIEW_CITY(2,"SUPPORT_TICKET_VIEW_CITY", AccessLevel.CITY, Arrays.asList(SupportModule.BLISS_DASHBOARD)), // 2
    SUPPORT_TICKET_VIEW_MICROMARKET(3,"SUPPORT_TICKET_VIEW_MICROMARKET", AccessLevel.MICROMARKET, Arrays.asList(SupportModule.BLISS_DASHBOARD)), // 3
    SUPPORT_TICKET_VIEW_RESIDENCE(4,"SUPPORT_TICKET_VIEW_RESIDENCE", AccessLevel.RESIDENCE, Arrays.asList(SupportModule.BLISS_DASHBOARD)), //4
    SUPPORT_L1_RC(4,"SUPPORT_L1_RC",AccessLevel.RESIDENCE,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SUPPORT_L2_MM(3,"SUPPORT_L2_MM",AccessLevel.MICROMARKET,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SUPPORT_L2_RM_SUPV(3,"SUPPORT_L2_RM_SUPV",AccessLevel.MICROMARKET,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SUPPORT_L3_CH(2,"SUPPORT_L3_CH",AccessLevel.CITY,Arrays.asList(SupportModule.BLISS_DASHBOARD,SupportModule.TICKET_RESOLUTION)),
    SUPPORT_PI_L1_SOS(2,"SUPPORT_PI_L1_SOS",AccessLevel.CITY,Arrays.asList(SupportModule.BLISS_DASHBOARD,SupportModule.TICKET_RESOLUTION)),
    SUPPORT_PI_L2_SBR_LEAD(2, "SUPPORT_PI_L2_SBR_LEAD",AccessLevel.CITY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SUPPORT_PI_L3_MANAGER(1, "SUPPORT_PI_L3_MANAGER",AccessLevel.COUNTRY,Arrays.asList(SupportModule.BLISS_DASHBOARD,SupportModule.TICKET_RESOLUTION)),
    SUPPORT_PS_L1_CXTL(2, "SUPPORT_PS_L1_CXTL",AccessLevel.CITY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SUPPORT_PS_L2_MANAGER(1, "SUPPORT_PS_L2_MANAGER",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SUPPORT_CX_WAR_ROOM(1, "SUPPORT_CX_WAR_ROOM",AccessLevel.COUNTRY,Arrays.asList(SupportModule.BLISS_DASHBOARD,SupportModule.TICKET_RESOLUTION)),
    SUPPORT_SUB_TASK_EDIT(2, "SUPPORT_SUB_TASK_EDIT",AccessLevel.CITY,Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_L1_IT_EXEC(2,"SUPPORT_L1_IT_EXEC",AccessLevel.CITY,Arrays.asList(SupportModule.BLISS_DASHBOARD,SupportModule.TICKET_RESOLUTION)),
    SUPPORT_L2_IT_LEAD(1,"SUPPORT_L2_IT_LEAD",AccessLevel.COUNTRY,Arrays.asList(SupportModule.BLISS_DASHBOARD,SupportModule.TICKET_RESOLUTION)),
    SUPPORT_L1_RM_MST(4,"SUPPORT_L1_RM_MST",AccessLevel.RESIDENCE,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SUPPORT_EXECUTIVE_CHEF(3,"SUPPORT_EXECUTIVE_CHEF",AccessLevel.MICROMARKET,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SUPPORT_CATERING_MANAGER(4,"SUPPORT_CATERING_MANAGER",AccessLevel.RESIDENCE,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    TRANSFORMATION_HEAD(1,"TRANSFORMATION_HEAD",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    DESIGN_NATIONAL_HEAD(2,"DESIGN_NATIONAL_HEAD",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    DESIGN_ZONAL_HEAD(3,"DESIGN_ZONAL_HEAD",AccessLevel.CITY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    DESIGN_COORDINATOR(4,"DESIGN_COORDINATOR",AccessLevel.CITY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    GORDON_L1_POC(1,"GORDON_L1_POC",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    GORDON_L2_POC(1,"GORDON_L2_POC",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    GORDON_L3_POC(1,"GORDON_L3_POC",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    JARVIS_L1_POC(1,"JARVIS_L1_POC",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    JARVIS_L2_POC(1,"JARVIS_L2_POC",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    JARVIS_L3_POC(1,"JARVIS_L3_POC",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    ALFRED_L1(1,"ALFRED_L1",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    ALFRED_L2(1,"ALFRED_L2",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SBR_IMS_L1(1,"SBR_IMS_L1",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SBR_IMS_L2(1,"SBR_IMS_L2",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SUPPORT_RM_HEAD(1,"SUPPORT_RM_HEAD",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SUPPORT_IT_MANAGER(1,"SUPPORT_IT_MANAGER",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    CX_TEAM_LEAD(1,"CX_TEAM_LEAD",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    CX_SPECIALIST(1,"CX_SPECIALIST",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    CX_AGENT(1,"CX_AGENT",AccessLevel.COUNTRY,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD)),
    SUPPORT_IT_EXEC_MICROMARKET(3,"SUPPORT_IT_EXEC_MICROMARKET",AccessLevel.MICROMARKET,Arrays.asList(SupportModule.TICKET_RESOLUTION,SupportModule.BLISS_DASHBOARD));

    private static final Map<String, SupportRole> map = new HashMap<>();

    static {
        for (SupportRole supportRole : SupportRole.values()) {
            map.put(supportRole.value, supportRole);
        }
    }

    private final Integer precedence;
    private final String value;
    private final AccessLevel accessLevel;
    private final List<SupportModule> modulesAvailable;

    public static SupportRole enumOf(String supportRole) {
        return map.get(supportRole);
    }

    public static AccessLevel getAccessLevelByPrecedence(Integer precedence) {
        switch (precedence) {
            case 1 :
                return AccessLevel.COUNTRY;
            case 2 :
                return AccessLevel.CITY;
            case 3 :
                return AccessLevel.MICROMARKET;
            case 4 :
                return AccessLevel.RESIDENCE;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return value;
    }

    public static final List<String> replyDeniedRoles = Arrays.asList("SUPPORT_L1_RC");
    public static final List<String> replyAccessRoles = Arrays.asList("SUPPORT_L1_RC", "SUPPORT_L1_RM_MST");
}
