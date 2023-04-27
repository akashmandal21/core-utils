/**
 * @author gaurav.likhar
 * @date 27/04/23
 * @project_name core-utils
 **/

package com.stanzaliving.paymentService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class PaymentMappingDto {
    @NotBlank(message = "source booking can't be null")
    private String sourceBookingId;

    @NotBlank(message = "destination booking can't be null")
    private String destinationBookingId;
}