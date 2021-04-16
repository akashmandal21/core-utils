package com.stanzaliving.genericdashboard.enums;

public enum WaitTimeUnit {
    MINUTES("MINUTES"),
    HOURS("HOURS"),
    DAYS("DAYS");

    public String waitTimeLayout;

    WaitTimeUnit(String waitTimeLayout) {
        this.waitTimeLayout = waitTimeLayout;
    }
}