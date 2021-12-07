package com.stanzaliving.core.payment.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeadPaymentRequestDto {

    private String phone;
    private String leadId;
    private String paymentId;
    private Date createdAt;
    private Integer bookingId;
    private String leadUuid;
    private String bookingUuid;

}
