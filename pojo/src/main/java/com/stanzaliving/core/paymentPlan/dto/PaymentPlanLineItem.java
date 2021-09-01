package com.stanzaliving.core.paymentPlan.dto;

import com.stanzaliving.booking.enums.PaymentPlanType;
import com.stanzaliving.booking.enums.ReferenceType;
import com.stanzaliving.core.paymentPlan.enums.LineItemValue;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPlanLineItem {

    private Long paymentPlanId;

    private Long id;

    private LineItemValue lineItemValue;

    private Double amount;

    private Double cgst;

    private Double sgst;

    private Double igst;

    private Map<String,String> metaData;

    private String serviceUuid;

    private String serviceName;

    private String invoiceUuid;


    private String uuid;

   // private Date createdAt;

    private String createdBy;

    //private Date updatedAt;

    private String updatedBy;

    private boolean status;

}
