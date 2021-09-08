package com.stanzaliving.wanda.venta.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
@ToString
public class PendingBookingVentaDto {
	
    private LocalDate moveInDate;
    
    private String houseName;
    
    private String bookingUuid;
    
    private String ventaHouseUuid;
    
    private String microMarketName;
    
    private String cityName;
    
    private Double price;
    
    private String occupancy;
    
    private String expiryDays;
    
}