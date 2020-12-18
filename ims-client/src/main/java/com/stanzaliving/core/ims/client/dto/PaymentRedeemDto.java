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
public class PaymentRedeemDto {

     private String brokerMobile;

     private Integer paymentModeId;

     private String name;

     private Double amountToRedeem;

     private String transactionId;
}
