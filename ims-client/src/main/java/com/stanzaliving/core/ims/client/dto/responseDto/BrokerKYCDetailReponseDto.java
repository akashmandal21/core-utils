package com.stanzaliving.core.ims.client.dto.responseDto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author harman
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BrokerKYCDetailReponseDto {

    private List<BrokerKYCDetail> brokerSavedDetails;

    private Boolean isPaytmBlocked;

    private boolean status;
}
