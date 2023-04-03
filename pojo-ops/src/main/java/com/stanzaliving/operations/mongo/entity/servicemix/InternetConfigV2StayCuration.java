package com.stanzaliving.operations.mongo.entity.servicemix;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class InternetConfigV2StayCuration implements Serializable {

    private List<InternetConfigDetailsV2StayCuration> basePlans;
    private List<InternetConfigDetailsV2StayCuration> addOnPlans;

}