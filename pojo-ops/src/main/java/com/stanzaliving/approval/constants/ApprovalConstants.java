package com.stanzaliving.approval.constants;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.user.acl.enums.Role;
import com.stanzaliving.core.user.enums.EnumListing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class ApprovalConstants {
    public static final List<String> l1ApprovalRoles = Arrays.asList(Role.COUNTRY_SERVICE_MIX_L1_APPROVER.getRoleName());
    public static final List<String> l2ApprovalRoles = Arrays.asList(Role.COUNTRY_SERVICE_MIX_L2_APPROVER.getRoleName());
    public static final List<String> l3ApprovalRoles = new ArrayList<>();

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


    public static final HashMap<ApprovalEntityType, Role> l1ApproverEntityTypeRoleMap = new HashMap<ApprovalEntityType, Role>(){{
        put(ApprovalEntityType.SERVICE_MIX, Role.COUNTRY_SERVICE_MIX_L1_APPROVER);
    }};

    public static final HashMap<ApprovalEntityType, Role> l2ApproverEntityTypeRoleMap = new HashMap<ApprovalEntityType, Role>(){{
        put(ApprovalEntityType.SERVICE_MIX, Role.COUNTRY_SERVICE_MIX_L2_APPROVER);
    }};

    public static final HashMap<ApprovalEntityType, Role> l3ApproverEntityTypeRoleMap = new HashMap<>();



}

