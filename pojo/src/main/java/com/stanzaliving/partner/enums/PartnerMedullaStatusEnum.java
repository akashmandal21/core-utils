package com.stanzaliving.partner.enums;

import com.google.common.collect.ImmutableSet;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public enum PartnerMedullaStatusEnum {
    ACCEPTANCE_PENDING("Acceptance pending", ImmutableSet.of("Vendor Acceptance pending", "Cancel L1 rejected", "Cancel L2 rejected", "Cancel L3 rejected")),
    ACCEPTED_BY_VENDOR("Accepted", ImmutableSet.of("Accepted by vendor")),
    REJECTED_BY_VENDOR("Rejected", ImmutableSet.of("Rejected by Vendor")),
    L3_CANCELLED("Cancelled", ImmutableSet.of("L3 Cancelled", "Cancelled")),
    SHORTCLOSE("Shortclosed", ImmutableSet.of("Shortclosed")),
    SHORTCLOSED_REQUESTED("Shortclose requested", ImmutableSet.of("Shortclose requested", "Shortclosing L1 approval due", "Shortclosing L2 approval due", "Shortclosing L3 approval due")),
    ON_HOLD("On hold", ImmutableSet.of("L1 Cancelled", "L2 Cancelled", "Cancel L1 due", "Cancel L2 due"));

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
