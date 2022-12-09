package com.stanzaliving.website.response.dto;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WebsiteNearByPlaceDto {

    private String placeId;

    private String name;

    private double latitude;

    private double longitude;
}
