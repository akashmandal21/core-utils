package com.stanzaliving.core.ims.client.dto.responseDto;

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
public class BrokerTdsDetailResponse {

    private String brokerMobile;

    private String transactionId;

    private String earningAmount;

    private String firstAmount;

    private String firstTdsPercent;

    private String firstTdsAmount;

    private String currentTdsPercent;

    private String currentTdsAmount;

    private String netPayout;

    private String remainingAmount;

    private String diffInAmountWithAndWithoutPan;


}
