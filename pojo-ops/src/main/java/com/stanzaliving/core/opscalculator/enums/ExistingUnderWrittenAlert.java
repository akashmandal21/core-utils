package com.stanzaliving.core.opscalculator.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum ExistingUnderWrittenAlert {
    UNDER_DRAFT_PARTIAL_OVERLAP(UnderWrittenStatus.UNDER_DRAFT, "Underwritten Already Exists!", "Underwritten already exisits for some or all dates. Do you want to discard this underwritten and start afresh?"),
    UNDER_DRAFT_COMPLETE_OVERLAP(UnderWrittenStatus.UNDER_DRAFT, "Underwritten Details Auto-Populated!", "Underwritten already exisits for the selected duration. The underwritten service mix version and other details been auto-populated for your reference. "),
    SENT_FOR_APPROVAL(UnderWrittenStatus.SENT_FOR_APPROVAL, "Underwritten Already Sent for Approval!", "Underwritten has already been sent for approval for some or all dates selected. Overlapping underwritten cannot be created."),
    APPROVED(UnderWrittenStatus.APPROVED, "Approved Underwritten Already Exists!", "Underwritten has already been approved for some or all dates selected. Overlapping underwritten cannot be created."),
    NONE(UnderWrittenStatus.NEW, "", "");

    UnderWrittenStatus underWrittenStatus;
    String heading;
    String subHeading;

    private static Map<UnderWrittenStatus, ExistingUnderWrittenAlert> map = new HashMap<>();

    public static ExistingUnderWrittenAlert getExistingUnderWrittenAlert(UnderWrittenStatus underWrittenStatus, boolean partial) {
        if (UnderWrittenStatus.SENT_FOR_APPROVAL.equals(underWrittenStatus)) {
            return SENT_FOR_APPROVAL;
        }
        if (UnderWrittenStatus.APPROVED.equals(underWrittenStatus)) {
            return APPROVED;
        }
        if (partial && UnderWrittenStatus.UNDER_DRAFT.equals(underWrittenStatus)) {
            return UNDER_DRAFT_PARTIAL_OVERLAP;
        }
        if (!partial && UnderWrittenStatus.UNDER_DRAFT.equals(underWrittenStatus)) {
            return UNDER_DRAFT_COMPLETE_OVERLAP;
        }
        return NONE;
    }
}
