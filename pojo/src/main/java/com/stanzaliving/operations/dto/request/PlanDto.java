package com.stanzaliving.operations.dto.request;
import java.io.Serializable;
import java.time.LocalDate;

import com.stanzaliving.operations.enums.ServiceMixServiceType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanDto implements Serializable {
    private static final long serialVersionUID = -4710238217519715714L;
    private ServiceMixServiceType serviceMixServiceType;
    private String planId;
    private LocalDate planStartDate;
    private LocalDate planEndDate;

}