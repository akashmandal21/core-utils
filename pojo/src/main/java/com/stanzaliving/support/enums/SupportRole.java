package com.stanzaliving.support.enums;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public enum SupportRole {

    SIGMA_CUSTOMER_SUPPORT("SIGMA_CUSTOMER_SUPPORT", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_VIEW_ALL("SUPPORT_TICKET_VIEW_ALL", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_EDIT_ALL("SUPPORT_TICKET_EDIT_ALL", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_VIEW_CITY("SUPPORT_TICKET_VIEW_CITY", AccessLevel.CITY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_VIEW_MICROMARKET("SUPPORT_TICKET_VIEW_MICROMARKET", AccessLevel.MICROMARKET, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_VIEW_RESIDENCE("SUPPORT_TICKET_VIEW_RESIDENCE", AccessLevel.RESIDENCE, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_EDIT_L1_CITY("SUPPORT_TICKET_EDIT_L1_CITY", AccessLevel.CITY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_EDIT_L1_MICROMARKET("SUPPORT_TICKET_EDIT_L1_MICROMARKET", AccessLevel.MICROMARKET, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_EDIT_L1_RESIDENCE("SUPPORT_TICKET_EDIT_L1_RESIDENCE", AccessLevel.RESIDENCE, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_EDIT_L2_CITY("SUPPORT_TICKET_EDIT_L2_CITY", AccessLevel.CITY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_EDIT_L2_MICROMARKET("SUPPORT_TICKET_EDIT_L2_MICROMARKET", AccessLevel.MICROMARKET, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_EDIT_L2_RESIDENCE("SUPPORT_TICKET_EDIT_L2_RESIDENCE", AccessLevel.RESIDENCE, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_EDIT_L3_CITY("SUPPORT_TICKET_EDIT_L3_CITY", AccessLevel.CITY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_EDIT_L3_MICROMARKET("SUPPORT_TICKET_EDIT_L3_MICROMARKET", AccessLevel.MICROMARKET, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
    SUPPORT_TICKET_EDIT_L3_RESIDENCE("SUPPORT_TICKET_EDIT_L3_RESIDENCE", AccessLevel.RESIDENCE, Arrays.asList(SupportModule.BLISS_DASHBOARD));
//    SUPPORT_CX_WAR_ROOM("SUPPORT_CX_WAR_ROOM", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_BULK_TICKET_UPDATE_CITY("SUPPORT_BULK_TICKET_UPDATE_CITY", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_BULK_TICKET_UPDATE_MICROMARKET("SUPPORT_BULK_TICKET_UPDATE_MICROMARKET", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_BULK_TICKET_UPDATE_RESIDENCE("SUPPORT_BULK_TICKET_UPDATE_RESIDENCE", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_TEMPLATE_VIEW("SUPPORT_TEMPLATE_VIEW", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_TEMPLATE_EDIT("SUPPORT_TEMPLATE_EDIT", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_TEMPLATE_APPROVAL_L1("SUPPORT_TEMPLATE_APPROVAL_L1", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_TEMPLATE_APPROVAL_L2("SUPPORT_TEMPLATE_APPROVAL_L2", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_TEMPLATE_APPROVAL_L3("SUPPORT_TEMPLATE_APPROVAL_L3", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_FAQ_VIEW("SUPPORT_FAQ_VIEW", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_FAQ_EDIT("SUPPORT_FAQ_EDIT", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_FAQ_APPROVAL_L1("SUPPORT_FAQ_APPROVAL_L1", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_FAQ_APPROVAL_L2("SUPPORT_FAQ_APPROVAL_L2", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_FAQ_APPROVAL_L3("SUPPORT_FAQ_APPROVAL_L3", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_RESOLUTION_FLOW_VIEW("SUPPORT_RESOLUTION_FLOW_VIEW", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_RESOLUTION_FLOW_EDIT("SUPPORT_RESOLUTION_FLOW_EDIT", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_COMPLAINT_TREE_VIEW("SUPPORT_COMPLAINT_TREE_VIEW", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_COMPLAINT_TREE_EDIT("SUPPORT_COMPLAINT_TREE_EDIT", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_CHECKLIST_VIEW("SUPPORT_CHECKLIST_VIEW", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_CHECKLIST_EDIT("SUPPORT_CHECKLIST_EDIT", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_SERVICE_MIX_VIEW("SUPPORT_SERVICE_MIX_VIEW", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_SERVICE_MIX_EDIT("SUPPORT_SERVICE_MIX_EDIT", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_TAGS_MANAGEMENT_VIEW("SUPPORT_TAGS_MANAGEMENT_VIEW", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_TAGS_MANAGEMENT_EDIT("SUPPORT_TAGS_MANAGEMENT_EDIT", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_RESIDENCE_MAPPING_VIEW("SUPPORT_RESIDENCE_MAPPING_VIEW", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD)),
//    SUPPORT_RESIDENCE_MAPPING_EDIT("SUPPORT_RESIDENCE_MAPPING_EDIT", AccessLevel.COUNTRY, Arrays.asList(SupportModule.BLISS_DASHBOARD));

    private static final Map<String, SupportRole> map = new HashMap<>();

    static {
        for (SupportRole supportRole : SupportRole.values()) {
            map.put(supportRole.value, supportRole);
        }
    }

    private final String value;
    private final AccessLevel accessLevel;
    private final List<SupportModule> modulesAvailable;

    public static SupportRole enumOf(String supportRole) {
        return map.get(supportRole);
    }

    @Override
    public String toString() {
        return value;
    }
}
