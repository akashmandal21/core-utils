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
public class FoodConfigV2StayCuration implements Serializable {

    private FoodCompositionConfigV2 foodCompositionConfig;
    private boolean active;

    private String menuPlanId;
    private String menuPlanName;
    private String menuPlanCode;

    private List<FoodConfigDetailsV2StayCuration> basePlans;
    private List<FoodConfigDetailsV2StayCuration> addOnPlans;
}
