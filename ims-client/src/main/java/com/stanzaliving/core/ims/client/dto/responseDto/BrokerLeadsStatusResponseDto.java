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
public class BrokerLeadsStatusResponseDto {

    private int disquailifiedLeadsCount;

    private int inProgressLeadsCount;

    private int bookedLeadsCount;

    private int totalLeadsCount;

    private int preBookedLeadsCount;

    private boolean status;
}
