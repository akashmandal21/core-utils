package com.stanzaliving.core.bookingservice.dto.response;

import com.stanzaliving.booking.enums.BookingSubStatus;
import com.stanzaliving.core.bookingservice.dto.response.PackagedServiceResponseDto;
import com.stanzaliving.core.bookingservice.dto.response.UserDetailResponseDto;
import com.stanzaliving.core.discount.dto.response.BookingDiscountDetailsResponseDto;

import io.github.resilience4j.core.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDetailDto {

    private String bookingUuid;
    private BookingSubStatus bookingSubStatus;
    private String source;
    private UserDetailResponseDto userDetailResponseDto;
    private BookingDurationResponseDto bookingDurationDto;
    private RoomDetailsDto roomDetailsDto;
    private PackagedServiceResponseDto packagedServices;
    @NonNull
    private CommercialCodeDto commercialDetailsDto;
    private BookingDiscountDetailsResponseDto discountDetailsDto;
    private String alert;

}