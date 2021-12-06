package com.stanzaliving.core.payment.client.dto;

import lombok.Data;

import java.util.Date;

@Data
public class LeadPaymentRequestDto {

    private String phone;
    private String leadId;
    private String paymentId;
    private Date createdAt;
    private Integer bookingId;
    private String leadUuid;
    private String bookingUuid;

}
