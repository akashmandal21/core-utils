package com.stanzaliving.core.far.enums;

public enum OtherArea {
    KITCHEN("Kitchen"), RECEPTION("Reception"), COMMON_AREA("Common Area"), BACK_OF_HOUSE("Back Of House"), GYM("Gym"), LOUNGE("Lounge"), LAUNDRY("Laundry"), COMMON_WASHROOM("Common Washroom");

    private String label;

    OtherArea(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}