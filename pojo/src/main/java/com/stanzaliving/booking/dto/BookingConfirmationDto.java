/**
 * @author gaurav.likhar
 * @date 21/04/23
 * @project_name booking-service-v2
 **/

package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingConfirmationDto {
    private List<String> bookingUuidList;
}
