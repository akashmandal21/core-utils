package com.stanzaliving.locator.dto;

import lombok.Data;

@Data
public class TechParks {

	
    private Integer id;

    private String city;
    private String name;
    private String address;
    private Double latitude;
    private Double longitude;
    private Double distance;
}
