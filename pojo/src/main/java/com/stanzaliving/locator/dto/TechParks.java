package com.stanzaliving.locator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TechParks {

	
    private Integer id;

    private String city;
    private String name;
    private String address;
    private Double latitude;
    private Double longitude;
    private Double distance;
}
