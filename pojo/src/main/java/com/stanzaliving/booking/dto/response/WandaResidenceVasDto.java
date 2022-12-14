package com.stanzaliving.booking.dto.response;

import com.stanzaliving.core.residenceservice.enums.BillingFrequency;
import com.stanzaliving.residenceservice.enums.VasCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WandaResidenceVasDto {

    private String residenceUuid;
    private String vasName;
    private String globalVasUuid;
    private BillingFrequency billingFrequency;
    private String serviceIcon;
    private Double totalAmount;
    private Date toDate;
    private Date fromDate;
    private VasCategory vasCategory;
}
