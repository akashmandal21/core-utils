package com.stanzaliving.wanda.response;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class PendingBookingDto {

	private String houseName;
	
	private String micromarketName;
	
	private String cityName;
	
	private double amount;
	
	private String occupancy;
	
	private List<String> images;
	
	private String imageOverlayMessage;
	
	private LocalDate moveInDate;
}
