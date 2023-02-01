package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.Blanket;
import com.stanzaliving.operations.dto.servicemix.BooleanConfig;
import com.stanzaliving.operations.dto.servicemix.NightCurfew;
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
public class SecurityConfigV2 {
    @Id
    private String id;
    @Builder.Default
    private String securityPlanId = "Security_Default_Plan_Id";
    @Builder.Default
    private String securityPlanName = "Default Plan";
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
