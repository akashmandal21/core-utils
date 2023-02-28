package com.stanzaliving.operations.mongo.entity.servicemix;

import java.io.Serializable;

import com.stanzaliving.core.enums.DataUnit;
import com.stanzaliving.internet.enums.InternetVendor;
import com.stanzaliving.operations.dto.servicemix.PlanData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class InternetConfigDetailsV2StayCuration implements Serializable {
    private String planId;
    private String planName;
    private InternetVendor vendor;
    private int devices;
    private Double totalPrice;
    private DataUnit dataUnit;
    private DataUnit speedUnit;
    private PlanData planData;
    private String planCategoryName;
    private String planCategoryId;
    private boolean active;
}
