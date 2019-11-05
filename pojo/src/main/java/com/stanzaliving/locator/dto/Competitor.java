package com.stanzaliving.locator.dto;


import lombok.Data;

@Data
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
    
}
