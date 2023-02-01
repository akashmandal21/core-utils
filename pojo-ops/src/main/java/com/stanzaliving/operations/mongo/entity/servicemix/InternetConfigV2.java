package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.core.enums.DataUnit;
import com.stanzaliving.internet.enums.InternetVendor;
import com.stanzaliving.operations.dto.servicemix.PlanData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class InternetConfigV2 {
    @Id
    private String id;
    private String internetPlanId;
    private InternetVendor vendor;
    private int devices;
    private Double totalPrice;
    private String planName;
    private DataUnit dataUnit;
    private DataUnit speedUnit;
    private PlanData planData;
    private boolean active;
    @Builder.Default
    private boolean defaultPlan = false;

}
