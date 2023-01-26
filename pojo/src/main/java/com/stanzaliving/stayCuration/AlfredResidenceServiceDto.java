package com.stanzaliving.stayCuration;

import lombok.*;

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

    private Double jarvisPlanUuid;

    private Double serviceMixUuid;

    private Object description;

    private Double planAmountWithoutGst;

    private Double planAmountWithGst;

    private GstDto cgst;

    private GstDto sgst;

    private GstDto igst;

    private String planBillingFrequency;

    private double planAmountBreakageFee;

    private LockInDto lockIn;

}
