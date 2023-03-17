package com.stanzaliving.operations.mongo.entity.servicemix;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GymConfigV2StayCuration implements Serializable {
    private List<GymConfigDetailsV2StayCuration> basePlans;
    private List<GymConfigDetailsV2StayCuration> addOnPlans;
}
