package com.stanzaliving.booking.dto.request;

import com.stanzaliving.residenceservice.enums.PlanTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@Data
@SuperBuilder
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

    @Builder.Default
    private PlanTypeEnum planType = PlanTypeEnum.POSTPAID;

    public PlanTypeEnum getPlanType() {
        return Objects.nonNull(this.planType) ? this.planType : PlanTypeEnum.POSTPAID;
    }
}
