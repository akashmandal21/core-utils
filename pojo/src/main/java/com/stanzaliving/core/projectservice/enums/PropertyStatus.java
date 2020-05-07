package com.stanzaliving.core.projectservice.enums;

import com.stanzaliving.core.projectservice.enums.ProgressColor;
import lombok.Getter;



@Getter
public enum PropertyStatus {

    NOT_STARTED("Not Started", ProgressColor.NOT_STARTED_COLOR),
    DELAYED("Delayed", ProgressColor.DELAYED_COLOR),
    ON_TRACK("On Track", ProgressColor.ON_TRACK_COLOR),
    AHEAD("Ahead", ProgressColor.AHEAD_COLOR),
    COMPLETED("Completed", ProgressColor.COMPLETED_COLOR),
    DROPPED("Dropped",ProgressColor.NOT_STARTED_COLOR);

    private String projectStatusFormat;
    private String color;

    PropertyStatus(String projectStatusFormat, String color){
        this.projectStatusFormat = projectStatusFormat;
        this.color = color;
    }
}
