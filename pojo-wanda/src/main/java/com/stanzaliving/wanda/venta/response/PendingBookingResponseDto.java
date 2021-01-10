package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PendingBookingResponseDto {
    private String moveInDate;
    private String houseName;
    private String bookingUuid;
    private String ventaHouseUuid;
    private String microMarketName;
    private String cityName;
    private Double price;
    private String occupancy;
    private String expiryDays;

}
