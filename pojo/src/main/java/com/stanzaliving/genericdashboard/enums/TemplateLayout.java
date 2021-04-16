package com.stanzaliving.genericdashboard.enums;

public enum TemplateLayout {
    FULL_SCREEN_FOOD_RATING("FULL_SCREEN_FOOD_RATING"),
    MODAL_VIEW_FOOD_RATING("MODAL_VIEW_FOOD_RATING"),
    BOTTOM_STICKY_FOOD_RATING("BOTTOM_STICKY_FOOD_RATING"),
    IMAGE("IMAGE"),
    IMAGE_TEXT("IMAGE_TEXT"),
    IN_APP("IN_APP"),
    TEXT("TEXT"),
    MODAL_VIEW_COMPLAINT_FEEDBACK("MODAL_VIEW_COMPLAINT_FEEDBACK"),
    MODAL_VIEW_VAS_FEEDBACK("MODAL_VIEW_VAS_FEEDBACK"),
    CUSTOM("CUSTOM");

    public String templateLayout;

    TemplateLayout(String templateLayout) {
        this.templateLayout = templateLayout;
    }
}
