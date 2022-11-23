package com.stanzaliving.locator.dto;

import com.stanzaliving.core.locator.PlaceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PlaceDto {
    private String placeType;
    private String city;
    private Double latitude;
    private Double longitude;
    private String name;
    private Double distance;
}
