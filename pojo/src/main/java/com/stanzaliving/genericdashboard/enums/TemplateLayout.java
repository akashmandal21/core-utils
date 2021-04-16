package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TemplateLayout {
    FULL_SCREEN_FOOD_RATING("Full Screen Food Rating"),
    MODAL_VIEW_FOOD_RATING("Modal View Food Rating"),
    BOTTOM_STICKY_FOOD_RATING("Bottom Sticky Food Rating"),
    IMAGE("Image"),
    IMAGE_TEXT("Image Text"),
    IN_APP("In App"),
    TEXT("Text"),
    MODAL_VIEW_COMPLAINT_FEEDBACK("Modal View Complaint Feedback"),
    MODAL_VIEW_VAS_FEEDBACK("Modal View VAS Feedback"),
    CUSTOM("Custom");

    String layout;

}
