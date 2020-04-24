package com.stanzaliving.locator.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    private Double minRent;
    private Double maxRent;
    private String zoloCode;
    
}
