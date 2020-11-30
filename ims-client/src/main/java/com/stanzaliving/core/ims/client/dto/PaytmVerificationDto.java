package com.stanzaliving.core.ims.client.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author harman
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PaytmVerificationDto {

    private PayoutMode payoutMode;

    private String paytmNumber;

    private String validationKey;
}
