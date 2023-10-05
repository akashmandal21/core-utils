package com.stanzaliving.campaign.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RentDueAnalyticDto {

    private String bookingUuid;
    private double amount;

}
