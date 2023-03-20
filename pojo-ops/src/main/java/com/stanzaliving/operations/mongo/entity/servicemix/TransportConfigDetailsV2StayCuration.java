package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.enums.TransportAvailabilityMode;
import com.stanzaliving.operations.enums.TransportSchedule;
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
public class TransportConfigDetailsV2StayCuration implements Serializable {
    private String id;
    private String planId;
    private String planName;
    private TransportAvailabilityMode availability;
    private TransportSchedule schedule;
    private Double freeKm;
    private boolean active;
    @Builder.Default
    private boolean defaultPlan = false;
}
