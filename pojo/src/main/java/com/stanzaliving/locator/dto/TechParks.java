package com.stanzaliving.locator.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TechParks {

	
    private Integer id;

    private String city;
    private String name;
    private String address;
    private Double latitude;
    private Double longitude;
    private Double distance;
}
