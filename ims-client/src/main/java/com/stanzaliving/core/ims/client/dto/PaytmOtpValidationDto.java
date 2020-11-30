package com.stanzaliving.core.ims.client.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author harman
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PaytmOtpValidationDto extends PaytmSendOtpDto{

    private String validationKey;
}
