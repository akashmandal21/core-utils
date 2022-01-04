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
    SUPPORT_SUB_TASK_EDIT(2, "SUPPORT_SUB_TASK_EDIT",AccessLevel.CITY,Arrays.asList(SupportModule.BLISS_DASHBOARD));

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
}
