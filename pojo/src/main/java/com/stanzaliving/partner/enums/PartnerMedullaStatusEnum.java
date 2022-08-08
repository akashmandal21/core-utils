package com.stanzaliving.partner.enums;

import com.google.common.collect.ImmutableSet;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public enum PartnerMedullaStatusEnum {
    ACCEPTANCE_PENDING("Acceptance Pending", ImmutableSet.of("Vendor Acceptance Pending", "Cancel L1 Rejected", "Cancel L2 Rejected", "Cancel L3 Rejected"), "#FFB701", "#FFEAB6"),
    ACCEPTED_BY_VENDOR("Accepted", ImmutableSet.of("Accepted By Vendor", "Approved"), "#60C3AD", "#EDFFF5"),
    REJECTED_BY_VENDOR("Rejected", ImmutableSet.of("Rejected By Vendor"), "#FF5238", "#FFE5E1"),
    L3_CANCELLED("Cancelled", ImmutableSet.of("Cancelled"), "#4E5253", "#CBCDCD"),
    SHORTCLOSE("Shortclosed", ImmutableSet.of("Shortclosed"), "#5F11D7", "#F4EEFF"),
    SHORTCLOSED_REQUESTED("Shortclose Requested", ImmutableSet.of("Shortclose Requested", "SC L1 Approval Due", "SC L2 Approval Due", "SC L3 Approval Due"), "#5F11D7", "#F4EEFF"),
    ON_HOLD("On Hold", ImmutableSet.of("Cancel L1 Due", "Cancel L2 Due", "Cancel L3 Due"), "#4E5253", "#E6E9EA"),
    SHORTCLOSED_REJECTED("SC rejected", ImmutableSet.of("SC L1 Rejected", "SC L2 Rejected", "SC L3 Rejected"), "#FF5238", "#FFE5E1"),
    GSRI_COMPLETED("GSRI Closed", ImmutableSet.of("GSRI Closed"), "#60C3AD", "#EDFFF5");

    private final String vendorStatus;
    private final Set<String> medullaStatus;
    private final String statusColor;
    private final String bgColor;


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
