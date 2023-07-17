package com.stanzaliving.operations.dto.request;
import com.stanzaliving.operations.enums.ServiceMixServiceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidentPlanAndAddOnSelectionDto implements Serializable {

    private static final long serialVersionUID = 7418983850455366724L;

    // All fields are mandatory except addOnPlans and serviceActivationListOnTokenPayment

    private String bookingUuid;

    private String residenceId;

    private String userUuid;
    private String residentCode;
    private String userName;
    private String email;
    private String mobile;

    private String serviceMixUuid;
    private Map<ServiceMixServiceType, List<PlanDto>> addOnPlans;

    //ACTION : TOKEN_PAYMENT, COMPLETE_PAYMENT, DEACTIVATE( In case of contract completed, contract terminated etc), PROPERTY_CHANGE
    private String action;

    private List<ServiceMixServiceType> serviceActivationListOnTokenPayment;
}
