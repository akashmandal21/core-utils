package com.stanzaliving.core.estate.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum PaidAmountStatus {
    RECOVERY_NEEDED("Recover", "To be recovered", "To be recovered"),
    WRITTEN_OFF("Write off", "Written off", "Written off"),
    NO_PAYMENT_DONE("No payment done till now", "No payment done till now", "No payment done till now");
    private String appDropDownValue;
    private String dashboardValue;
    private String emailValue;
    private static Map<String, PaidAmountStatus> paidAmountStatusMap = new HashMap<>();

    static {
        for(PaidAmountStatus paidAmountStatus : PaidAmountStatus.values()) {
            paidAmountStatusMap.put(paidAmountStatus.getAppDropDownValue(), paidAmountStatus);
        }
    }

    public static PaidAmountStatus getPaidAmountStatusByAppDropDownValue(String appDropDwnValue) {
        return paidAmountStatusMap.get(appDropDwnValue);
    }


}
