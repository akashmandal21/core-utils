package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.Blanket;
import com.stanzaliving.operations.dto.servicemix.BooleanConfig;
import com.stanzaliving.operations.dto.servicemix.NightCurfew;
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
public class SecurityConfigDetailsV2StayCuration implements Serializable {

    private String planId;
    private String planName;
    @Builder.Default
    private BooleanConfig bioMetric = new BooleanConfig();
    @Builder.Default
    private BooleanConfig cardAccess = new BooleanConfig();
    @Builder.Default
    private NightCurfew nightCurfew = new NightCurfew();
    @Builder.Default
    private Blanket blanket = new Blanket();
    @Builder.Default
    private BooleanConfig smartLock = new BooleanConfig();
    @Builder.Default
    private BooleanConfig facialRecognition = new BooleanConfig();
    private boolean active;
    @Builder.Default
    private boolean defaultPlan = false;
}
