package com.stanzaliving.core.generic.constants;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class GenericConstants {
    public static final String entityState = "entityState";
    public static final String actorRoleKey = "actorRole";
    public static final String currentAction = "currentAction";
    public static final String queryDepartmentKey = "queryDepartment";
    public static final String currentApprovedLevelOrderKey = "currentApprovalKey";
    public static final String maxApprovalLevelKey = "maxApprovalLevelKey";
    public static final Integer editRestrictMax = 10000000;
    public static final Integer approvalRestrictMax = 1000;
    public static final Integer rejectionStart=-8;
    public static final String sampleCsvStartLine="Data Starts Here:";
    public static final String addressBookMapName = "addressBook";
    public static final String inventorySummaryMapName = "inventorySummary";
    public static final int SCALE = 2;
    public static final RoundingMode roundingMode = RoundingMode.HALF_EVEN;
    public static final BigDecimal HUNDRED =  new BigDecimal("100", MathContext.DECIMAL128);
    public static final int SCALE10 = 10;
}
