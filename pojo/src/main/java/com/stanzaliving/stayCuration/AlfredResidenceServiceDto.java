package com.stanzaliving.stayCuration;

import com.stanzaliving.booking.enums.PaymentTerm;
import lombok.*;

import java.util.Date;
import java.util.Map;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class AlfredResidenceServiceDto {

    private String name;

    private String category;

    private String residenceUuid;

    private String jarvisPlanUuid;

    private String serviceMixUuid;

    private Object description;

    private Object meta;

    private Double planAmountWithoutGst;

    private Double planAmountWithGst;

    private GstDto cgst;

    private GstDto sgst;

    private GstDto igst;

    private PaymentTerm planBillingFrequency;

    private double planAmountBreakageFee;

    private LockInDto lockIn;
    
    private String planUuid;

    private String image;

    private Date planStartDate;

    private Date planEndDate;

    private boolean deprecated;

    private boolean optedOut;

}
