package com.stanzaliving.core.paymentPlan.dto;

import com.stanzaliving.booking.dto.request.VasPaymentPlanRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VasRequestDto {

    @NotEmpty(message = "vasPaymentPlanRequestDtoList cannot be empty")
    private List<VasPaymentPlanRequestDTO> vasPaymentPlanRequestDtoList;
}
