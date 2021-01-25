package com.stanzaliving.wanda.response;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdSerializer;

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
	
	private String amount;
	
	private String occupancy;
	
	private List<String> images;
	
	private String imageOverlayMessage;
	
	@JsonSerialize(using = Java8LocalDateStdSerializer.class)
	private LocalDate moveInDate;
	
	private String bookingId;
	
	private String houseId;
}
