package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.WashingService;
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
public class LaundryConfigDetailsV2StayCuration implements Serializable {

    private String planId;
    private String planName;
    @Builder.Default
    private WashingService washIron = new WashingService();
    @Builder.Default
    private WashingService washFold = new WashingService();
    private boolean active;
    @Builder.Default
    private boolean defaultPlan = false;
}
