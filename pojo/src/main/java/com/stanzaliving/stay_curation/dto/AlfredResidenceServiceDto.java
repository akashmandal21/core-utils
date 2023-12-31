package com.stanzaliving.stay_curation.dto;

import com.stanzaliving.booking.enums.PaymentTerm;
import lombok.*;

import java.util.Date;
import java.util.List;


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

    private List<String> showDescription;

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

    private String ventaImage;

    private Object tag;

    private Date planStartDate;

    private Date planEndDate;

    private boolean deprecated;

    private boolean optedOut;

    private String planType;

    private String nature;

}
