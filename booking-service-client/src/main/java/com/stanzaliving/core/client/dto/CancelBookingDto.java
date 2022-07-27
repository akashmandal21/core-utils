package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CancelBookingDto {
    private String bookingUuid;
    private Date cancellationDate;
    @NotBlank(message = "Remarks can not be empty. Please enter remarks for cancellation")
    private String remarks;
    private String createdBy;

}

