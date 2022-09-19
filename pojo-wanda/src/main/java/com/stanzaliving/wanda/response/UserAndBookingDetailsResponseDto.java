package com.stanzaliving.wanda.response;

        import com.stanzaliving.booking.enums.BookingSubType;
        import com.stanzaliving.core.security.policeverification.dto.UserDetailsDto;
        import com.stanzaliving.wanda.venta.response.RetentionBookingResponseDto;
        import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserAndBookingDetailsResponseDto {

    private UserDetailsDto userDetailsDto;

    private RetentionBookingResponseDto retentionBookingResponseDto;

    private BookingSubType bookingSubType;

    private String BookingStatus;
}
