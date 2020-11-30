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
public class BrokerPayoutDetailsDTO {
    private Integer id;

    private  Integer payoutModeId;

    private String identifier;

    private String value;

    private Boolean preferredPaymentMode;

    private String accountNumber;

    private String accountName;

    private String ifscCode;

    private String panName;

    private String panNumber;

    private String panImage;
}
