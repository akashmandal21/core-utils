package com.stanzaliving.approval.constants;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.user.acl.enums.Role;
import com.stanzaliving.core.user.enums.EnumListing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ApprovalConstants {
    public static final List<String> l1ApprovalRoles;
    public static final List<String> l2ApprovalRoles;
    public static final List<String> l3ApprovalRoles;
    public static final List<String> allApprovalRoles;

    public static final HashMap<ApprovalEntityType, Role> l1ApproverEntityTypeRoleMap = new HashMap<ApprovalEntityType, Role>(){{
        put(ApprovalEntityType.SERVICE_MIX, Role.COUNTRY_SERVICE_MIX_L1_APPROVER);
        put(ApprovalEntityType.SESSION_UNDERWRITTEN, Role.UNDER_WRITTEN_L1_APPROVER);
        put(ApprovalEntityType.MONTHLY_UNDERWRITTEN, Role.MONTHLY_UNDER_WRITTEN_L1_APPROVER);
        put(ApprovalEntityType.FOOD_MENU_CATEGORY, Role.FOOD_MENU_CATEGORY_L1_APPROVER);
    }};

    public static final HashMap<ApprovalEntityType, Role> l2ApproverEntityTypeRoleMap = new HashMap<ApprovalEntityType, Role>(){{
        put(ApprovalEntityType.SERVICE_MIX, Role.COUNTRY_SERVICE_MIX_L2_APPROVER);
        put(ApprovalEntityType.SESSION_UNDERWRITTEN, Role.UNDER_WRITTEN_L2_APPROVER);
        put(ApprovalEntityType.MONTHLY_UNDERWRITTEN, Role.MONTHLY_UNDER_WRITTEN_L2_APPROVER);
        put(ApprovalEntityType.FOOD_MENU_CATEGORY, Role.FOOD_MENU_CATEGORY_L2_APPROVER);
    }};

    public static final HashMap<ApprovalEntityType, Role> l3ApproverEntityTypeRoleMap = new HashMap<ApprovalEntityType, Role>(){{
        put(ApprovalEntityType.SERVICE_MIX, Role.COUNTRY_SERVICE_MIX_L3_APPROVER);
        put(ApprovalEntityType.MONTHLY_UNDERWRITTEN, Role.MONTHLY_UNDER_WRITTEN_L3_APPROVER);
        put(ApprovalEntityType.FOOD_MENU_CATEGORY, Role.FOOD_MENU_CATEGORY_L3_APPROVER);
    }};



    static {
        l1ApprovalRoles = l1ApproverEntityTypeRoleMap.values().stream().map(Role::getRoleName).collect(Collectors.toList());
        l2ApprovalRoles = l2ApproverEntityTypeRoleMap.values().stream().map(Role::getRoleName).collect(Collectors.toList());
        l3ApprovalRoles = l3ApproverEntityTypeRoleMap.values().stream().map(Role::getRoleName).collect(Collectors.toList());
        allApprovalRoles = Stream.of(l1ApprovalRoles, l2ApprovalRoles, l3ApprovalRoles).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public static final List<EnumListing<ApprovalStatus>> l1ApprovalStatusDropDown = Arrays.asList(
            EnumListing.of(ApprovalStatus.PENDING_L1_APPROVAL, ApprovalStatus.PENDING_L1_APPROVAL.getStatus()),
            EnumListing.of(ApprovalStatus.L1_REJECTED, ApprovalStatus.L1_REJECTED.getStatus()),
            EnumListing.of(ApprovalStatus.PENDING_L2_APPROVAL, ApprovalStatus.PENDING_L2_APPROVAL.getStatus()),
            EnumListing.of(ApprovalStatus.L2_REJECTED, ApprovalStatus.L2_REJECTED.getStatus()),
            EnumListing.of(ApprovalStatus.PENDING_L3_APPROVAL, ApprovalStatus.PENDING_L3_APPROVAL.getStatus()),
            EnumListing.of(ApprovalStatus.L3_REJECTED, ApprovalStatus.L3_REJECTED.getStatus())
    );

    public static final List<EnumListing<ApprovalStatus>> l2ApprovalStatusDropDown = Arrays.asList(
            EnumListing.of(ApprovalStatus.PENDING_L2_APPROVAL, ApprovalStatus.PENDING_L2_APPROVAL.getStatus()),
            EnumListing.of(ApprovalStatus.L2_REJECTED, ApprovalStatus.L2_REJECTED.getStatus()),
            EnumListing.of(ApprovalStatus.PENDING_L3_APPROVAL, ApprovalStatus.PENDING_L3_APPROVAL.getStatus()),
            EnumListing.of(ApprovalStatus.L3_REJECTED, ApprovalStatus.L3_REJECTED.getStatus())
    );

    public static final List<EnumListing<ApprovalStatus>> l3ApprovalStatusDropDown = Arrays.asList(
            EnumListing.of(ApprovalStatus.PENDING_L3_APPROVAL, ApprovalStatus.PENDING_L3_APPROVAL.getStatus()),
            EnumListing.of(ApprovalStatus.L3_REJECTED, ApprovalStatus.L3_REJECTED.getStatus())
    );

}

