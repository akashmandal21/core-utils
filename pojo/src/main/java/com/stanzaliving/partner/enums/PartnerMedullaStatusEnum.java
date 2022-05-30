package com.stanzaliving.partner.enums;

import com.google.common.collect.ImmutableSet;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public enum PartnerMedullaStatusEnum {
    ACCEPTANCE_PENDING("Acceptance Pending", ImmutableSet.of("Vendor Acceptance Pending", "Cancel L1 Rejected", "Cancel L2 Rejected", "Cancel L3 Rejected")),
    ACCEPTED_BY_VENDOR("Accepted", ImmutableSet.of("Accepted By Vendor", "GSRI Closed")),
    REJECTED_BY_VENDOR("Rejected", ImmutableSet.of("Rejected By Vendor")),
    L3_CANCELLED("Cancelled", ImmutableSet.of("Cancelled")),
    SHORTCLOSE("Shortclosed", ImmutableSet.of("Shortclosed")),
    SHORTCLOSED_REQUESTED("Shortclose Requested", ImmutableSet.of("Shortclose Requested", "SC L1 Approval Due", "SC L2 Approval Due", "SC L3 Approval Due")),
    ON_HOLD("On Hold", ImmutableSet.of("Cancel L1 Due", "Cancel L2 Due", "Cancel L3 Due")),
    SHORTCLOSED_REJECTED("SC rejected", ImmutableSet.of("SC L1 Rejected", "SC L2 Rejected", "SC L3 Rejected"));

    private final String vendorStatus;
    private final Set<String> medullaStatus;


    public static PartnerMedullaStatusEnum fromVendorStatus(String vendorStatus) {
        for (PartnerMedullaStatusEnum b : PartnerMedullaStatusEnum.values()) {
            if (b.vendorStatus.equalsIgnoreCase(vendorStatus)) {
                return b;
            }
        }
        return null;
    }

    public static PartnerMedullaStatusEnum fromMedullaStatus(String medullaStatus) {
        for (PartnerMedullaStatusEnum b : PartnerMedullaStatusEnum.values()) {
            if (b.medullaStatus.contains(medullaStatus)) {
                return b;
            }
        }
        return null;
    }
}
