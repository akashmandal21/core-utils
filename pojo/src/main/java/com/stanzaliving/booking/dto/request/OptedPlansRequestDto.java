package com.stanzaliving.booking.dto.request;

import com.stanzaliving.residenceservice.enums.PlanTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptedPlansRequestDto {

    @NotNull(message = "planUuid cannot be null")
    @Valid
    private String planUuid;

    @NotNull(message = "serviceMixUuid cannot be null")
    @Valid
    private String serviceMixUuid;

    @NotNull(message = "optInDate cannot be null")
    @Valid
    private Date optInDate;

    private PlanTypeEnum planType = PlanTypeEnum.POSTPAID;
}
