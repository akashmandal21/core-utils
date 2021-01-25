package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
@AllArgsConstructor
public enum FoodMenuStatus {

    UNDER_DRAFT("In Draft"),
    SUBMITTED("Submitted"),
    APPROVED("Approved"),
    REJECTED("Rejected"),

    CENTRAL_F_AND_B_APPROVED("Central F&B Approved"),
    CENTRAL_F_AND_B_REJECTED("Central F&B Rejected"),
    VENDOR_APPROVED("Vendor Approved"),
    VENDOR_REJECTED("Vendor Rejected");

    private String statusName;

    private static final List<EnumListing<FoodMenuStatus>> enumListing = new ArrayList<>();

    static {
        for (FoodMenuStatus curOption : FoodMenuStatus.values()) {
            EnumListing<FoodMenuStatus> listing = EnumListing.of(curOption, curOption.getStatusName());
            enumListing.add(listing);
        }
    }

    public static List<EnumListing<FoodMenuStatus>> getEnumListing() {
        return enumListing;
    }


    private static List<FoodMenuStatus> editableStatus(boolean flexiMenuEnabled) {
        if (flexiMenuEnabled) {
            return Arrays.asList(UNDER_DRAFT, APPROVED, REJECTED);
        } else {
            return Arrays.asList(UNDER_DRAFT, CENTRAL_F_AND_B_REJECTED, VENDOR_REJECTED);
        }
    }

    public static boolean isStatusEditable(FoodMenuStatus menuStatus, boolean flexiMenuEnabled) {
        return editableStatus(flexiMenuEnabled).contains(menuStatus);
    }

    private static List<FoodMenuStatus> getStatusCentralFAndBApproved(boolean flexiMenuEnabled) {
        if (flexiMenuEnabled) {
            return Collections.singletonList(APPROVED);
        } else {
            return Arrays.asList(APPROVED, CENTRAL_F_AND_B_APPROVED, VENDOR_REJECTED, VENDOR_APPROVED);
        }
    }

    public static boolean isStatusCentralFAndBApproved(FoodMenuStatus menuStatus, boolean flexiMenuEnabled) {
        return getStatusCentralFAndBApproved(flexiMenuEnabled).contains(menuStatus);
//        return APPROVED == menuStatus || CENTRAL_F_AND_B_APPROVED == menuStatus || VENDOR_REJECTED == menuStatus || VENDOR_APPROVED == menuStatus;
    }

    private static List<FoodMenuStatus> getVendorStatusApproved(boolean flexiMenuEnabled) {
        if (flexiMenuEnabled) {
            return Collections.singletonList(APPROVED);
        } else {
            return Arrays.asList(APPROVED, VENDOR_APPROVED);
        }
    }


    public static boolean isStatusVendorApproved(FoodMenuStatus menuStatus, boolean flexiMenuEnabled) {
        return getVendorStatusApproved(flexiMenuEnabled).contains(menuStatus);
    }

    public static boolean isStatusCentralApprovable(FoodMenuStatus menuStatus, boolean flexiMenuEnabled) {
        return !flexiMenuEnabled && SUBMITTED == menuStatus;
    }

    public static List<FoodMenuStatus> getStatusForApprovalListing(boolean flexiMenuEnabled) {
        List<FoodMenuStatus> foodMenuStatuses = new ArrayList<>();
        if (!flexiMenuEnabled) {
            foodMenuStatuses.add(CENTRAL_F_AND_B_APPROVED);
            foodMenuStatuses.add(CENTRAL_F_AND_B_REJECTED);
            foodMenuStatuses.add(VENDOR_APPROVED);
            foodMenuStatuses.add(VENDOR_REJECTED);
        }
        foodMenuStatuses.add(SUBMITTED);

        return foodMenuStatuses;
    }
}