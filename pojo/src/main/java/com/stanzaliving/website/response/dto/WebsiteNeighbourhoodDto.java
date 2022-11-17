package com.stanzaliving.website.response.dto;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WebsiteNeighbourhoodDto {

    private String placeType;

    List<WebsiteNearByPlaceDto> nearByPlaces;


}
