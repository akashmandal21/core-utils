/**
 * @author gaurav.likhar
 * @date 20/04/23
 * @project_name booking-service-v2
 **/

package com.stanzaliving.booking.dto;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingConfirmationResponseDto {
    private int totalBookingReceivedForConfirmation;
    private int countOfSuccessConfirmation;
    private int countOfFailureConfirmation;
}
