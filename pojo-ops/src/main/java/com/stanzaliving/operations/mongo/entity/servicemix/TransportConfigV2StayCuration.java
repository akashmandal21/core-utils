package com.stanzaliving.operations.mongo.entity.servicemix;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class TransportConfigV2StayCuration implements Serializable {
    private List<TransportConfigDetailsV2StayCuration> basePlans;
    private List<TransportConfigDetailsV2StayCuration> addOnPlans;
}
