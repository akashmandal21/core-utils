package com.stanzaliving.locator.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@ToString
@Setter
public class Competitor {
	
    private String city;
    private String provider;
    private Double latitude;
    private Double longitude;
    private String name;
    private Integer price;
    private String gender;
    private Integer privateRooms;
    private Integer sharingRooms;
    private Double distance;
    private String address;
    private Integer minRent;
    private Integer maxRent;
    private String zoloCode;
    
}
