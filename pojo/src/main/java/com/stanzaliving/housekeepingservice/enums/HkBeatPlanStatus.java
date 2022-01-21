package com.stanzaliving.housekeepingservice.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikas S T
 * @date 13-Nov-21
 **/
@Getter
@AllArgsConstructor
public enum HkBeatPlanStatus {

    APPROVED("Approved"),
    DRAFT("Draft"),
    PENDING_L2_APPROVAL("Pending L2 Approval"),
    PENDING_L1_APPROVAL("Pending L1 Approval"),
    REJECTED("Rejected");

    private static final List<EnumListing<HkBeatPlanStatus>> enumListing = new ArrayList<>();

    static {
        for (HkBeatPlanStatus hkBeatPlanStatus : HkBeatPlanStatus.values()) {
            EnumListing<HkBeatPlanStatus> listing = EnumListing.of(hkBeatPlanStatus, hkBeatPlanStatus.getHkBeatPlanStatus());
            enumListing.add(listing);
        }
    }

    private String hkBeatPlanStatus;

    public static List<EnumListing<HkBeatPlanStatus>> getEnumListing() {
        return enumListing;
    }

}
