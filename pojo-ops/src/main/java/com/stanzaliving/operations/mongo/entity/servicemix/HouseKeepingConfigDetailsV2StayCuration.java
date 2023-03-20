package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.WeeklyService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class HouseKeepingConfigDetailsV2StayCuration implements Serializable {

    private String planId;
    private String planName;
    @Builder.Default
    private WeeklyService room = new WeeklyService();
    @Builder.Default
    private WeeklyService bathroom = new WeeklyService();
    @Builder.Default
    private WeeklyService commonBathroom = new WeeklyService();
    @Builder.Default
    private WeeklyService commonArea = new WeeklyService();
    @Builder.Default
    private WeeklyService linenChange = new WeeklyService();
    private boolean active;
    @Builder.Default
    private boolean defaultPlan = false;
}
